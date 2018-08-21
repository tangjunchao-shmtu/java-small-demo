package com.pattern.singleton.singletonThree;

/**
 * @author tangjunchao
 * 线程安全版，懒汉，性能不好
 */
public class MySingleton {

	private static MySingleton singleton;
	
	public static synchronized MySingleton getInstence() {
		if(singleton == null) {
			singleton = new MySingleton();
		}
		return singleton;
	}
	
}
