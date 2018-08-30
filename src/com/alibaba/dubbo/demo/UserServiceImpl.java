package com.alibaba.dubbo.demo;

public class UserServiceImpl implements UserService{

	@Override
	public String doit(String name) {
		return "hello:"+name;
	}

}
