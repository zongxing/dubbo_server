package com.alibaba.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {
		//http://192.168.20.30/wiki/display/dubbo/provider.xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"http://localhost/provider.xml"});
		context.start();
		System.in.read(); // 按任意键退出
	}
}
