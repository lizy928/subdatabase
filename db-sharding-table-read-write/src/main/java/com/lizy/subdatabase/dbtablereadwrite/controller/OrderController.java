package com.lizy.subdatabase.dbtablereadwrite.controller;

import com.lizy.subdatabase.common.entity.Order;
import com.lizy.subdatabase.dbtablereadwrite.mapper.OrderMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Resource
	private OrderMapper orderMapper;

	@GetMapping("/{id}")
	public Order get(@PathVariable Long id) {
		return orderMapper.selectById(id);
	}

	@GetMapping("/batch")
	public Object batch() {
		for (long i = 0; i < 100; i++) {
			Order order = new Order();
			order.setUserId(new Random().nextInt());
			order.setCreateTime(new Date());
			orderMapper.insert(order);
		}
		return "success";
	}
}