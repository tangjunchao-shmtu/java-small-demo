package com.pattern.singleton.singletonTwo;

/**
 * @author tangjunchao
 * 线程安全，饿汉
 */
public class MySingleton {

	private static MySingleton singleton = new MySingleton();
	
	public static MySingleton getInstence() {
		return singleton;
	}
	
}
