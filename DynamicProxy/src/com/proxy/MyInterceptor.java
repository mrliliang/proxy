package com.proxy;

public class MyInterceptor {
	
	public void before() {
		System.out.println("MyInterceptor.before() is invoked");
	}
	
	public void after() {
		System.out.println("MyInterceptor.after() is invoked");
	}
}
