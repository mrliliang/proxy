package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {
	
	private Object model = null;
	
	public InvocationHandlerImpl(Object model) {
		this.model = model;
	}
	
	private MyInterceptor interceptor = new MyInterceptor();

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		interceptor.before();
		result = method.invoke(model, args);
		interceptor.after();
		return result;
	}
}
