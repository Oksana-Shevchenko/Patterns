package com.example3.persondynamicproxy;

import java.lang.reflect.Proxy;

public class Demo {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.test();
	}

	private void test() {
		PersonBean person = new PersonBeanImpl();
		PersonBean ownerProxy = getOwnerProxy(person);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interest set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

		PersonBean nonOwnerProxy = getNonOwnerProxy(person);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.println("Can't set interest from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}

	private PersonBean getNonOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}

	private PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}
}
