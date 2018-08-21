package com.pattern.proxy.proxyOne;

public class Test {

	public static void main(String[] args) {
		
		IPerson tang = new Student("tang");
		StudentProxy tangProxy = new StudentProxy(tang);
		tangProxy.giveMoney();
		
		IPerson Li = new Student("Li");
		StudentProxy liProxy = new StudentProxy(Li);
		liProxy.giveMoney();
	}
	
}
