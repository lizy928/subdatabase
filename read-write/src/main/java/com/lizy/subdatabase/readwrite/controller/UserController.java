package com.lizy.subdatabase.readwrite.controller;

import com.lizy.subdatabase.common.entity.User;
import com.lizy.subdatabase.readwrite.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserMapper userMapper;

	@GetMapping("/{id}")
	public User get(@PathVariable Long id) {
		return userMapper.selectById(id);
	}

	@GetMapping("/batch")
	public Object batch() {
		for (long i = 0; i < 100; i++) {
			User user = new User();
			user.setId(i);
			user.setCity("深圳");
			user.setName("李四");
			user.setCreateTime(new Date());
			userMapper.insert(user);
		}
		return "success";
	}
}