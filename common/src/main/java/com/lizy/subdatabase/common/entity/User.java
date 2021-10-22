package com.lizy.subdatabase.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@TableName("user")
public class User {

	@TableId(value = "id")
	private Long id;
	
	@TableField("name")
	private String name;
	
	@TableField("city")
	private String city;

	@TableField("create_time")
	private Date createTime;
}
