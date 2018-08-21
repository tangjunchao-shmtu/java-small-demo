package com.pattern.proxy.proxyOne;

public class StudentProxy implements IPerson {

	private Student stu;
	
	public StudentProxy(IPerson person) {
		this.stu = (Student) person;
	}
	
	@Override
	public void giveMoney() {
		System.out.println("学生代理");
		stu.giveMoney();
	}

}
