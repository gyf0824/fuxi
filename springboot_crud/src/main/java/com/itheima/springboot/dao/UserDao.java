package com.itheima.springboot.dao;


import com.itheima.springboot.pojo.User;
import tk.mybatis.mapper.common.Mapper;


@org.apache.ibatis.annotations.Mapper
public interface UserDao extends Mapper<User> {
}
