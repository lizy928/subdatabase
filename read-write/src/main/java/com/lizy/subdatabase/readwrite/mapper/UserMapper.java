package com.lizy.subdatabase.readwrite.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lizy.subdatabase.common.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
