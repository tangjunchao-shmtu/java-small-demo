package com.pattern.singleton.singletonOne;

/**
 * @author tangjunchao
 * 线程安全版，懒加载，双重验证
 */
public class MySingleton {
	
	private volatile static MySingleton singleton;
	
	public static MySingleton getInstence() {
		
		if(singleton == null) {
			synchronized(MySingleton.class) {
				if(singleton == null) {
					singleton = new MySingleton();
				}
			}
		}
		
		return singleton;
	}
}
