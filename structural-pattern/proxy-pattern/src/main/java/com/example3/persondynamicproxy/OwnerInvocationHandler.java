package com.example3.persondynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	private PersonBean personBean;

	public OwnerInvocationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().startsWith("get")) {
			return method.invoke(personBean, args);
		} else if (method.getName().startsWith("setHotOrNotRating")) {
			throw new IllegalAccessException();
		} else if (method.getName().startsWith("set")) {
			return method.invoke(personBean, args);
		}
		return null;
	}
}
