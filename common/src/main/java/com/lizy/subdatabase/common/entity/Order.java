package com.lizy.subdatabase.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@TableName("order_list")
public class Order {

	@TableId(value = "id")
	private Integer id;
	
	@TableField("user_id")
	private Integer userId;

	@TableField("create_time")
	private Date createTime;
}
