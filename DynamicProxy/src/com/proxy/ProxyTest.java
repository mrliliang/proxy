package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		ModelImpl model = new ModelImpl();
		InvocationHandler handler = new InvocationHandlerImpl(model);
		ModelInterface businessProxy = (ModelInterface)Proxy.newProxyInstance(
				model.getClass().getClassLoader(), 
				model.getClass().getInterfaces(),
				handler);
		businessProxy.myFunction();
	}
}
