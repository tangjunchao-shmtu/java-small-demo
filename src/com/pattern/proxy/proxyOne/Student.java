package com.pattern.proxy.proxyOne;

public class Student implements IPerson {

	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	@Override
	public void giveMoney() {
		System.out.println(name + "交班费");
	}

}
