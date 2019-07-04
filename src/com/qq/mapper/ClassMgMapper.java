package com.qq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qq.model.User;


public interface ClassMgMapper {

	public int add(@Param(value="name") String name,@Param(value="password") String password);

	public List<User> check(String name);

	public List<User> check1(@Param(value="name") String name,@Param(value="password") String password);

	public List<User> queryAll();

	public int add1(@Param(value="name") String name,@Param(value="password") String password,@Param(value="power") String powers,@Param(value="email")String eamil,@Param(value="acl")String acl);

	public int del(int id);

	public int Update(@Param(value="id")int id, @Param(value="name") String name,@Param(value="pwd") String pwd,@Param(value="power")String power,@Param(value="email")String eamil,@Param(value="acl")String acl);

	public User querryId(int id);
	
}