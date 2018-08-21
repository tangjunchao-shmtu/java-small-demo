package com.pattern.factory.factoryOne;

/**
 * @author tangjunchao
 * 接口代理
 */
public class NoodleFactory {

	public static INoodle createNoodle(String name) {
		if(name.equals("la")) {
			return new LaNoodle();
		}else if(name.equals("pao")) {
			return new PaoNoodle();
		}else {
			return new BanNoodle();
		}
	}
	
}
