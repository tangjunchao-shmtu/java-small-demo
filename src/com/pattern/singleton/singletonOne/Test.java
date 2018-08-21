package com.pattern.singleton.singletonOne;

public class Test {

	public static void main(String[] args) {
		
		MySingleton s1 = MySingleton.getInstence();
		MySingleton s2 = MySingleton.getInstence();
		System.out.println(s1 == s2);
	}
	
}
