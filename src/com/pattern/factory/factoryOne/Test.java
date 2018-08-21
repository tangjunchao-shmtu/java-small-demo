package com.pattern.factory.factoryOne;

public class Test {

	public static void main(String[] args) {
		
		INoodle noodle = NoodleFactory.createNoodle("la");
		noodle.desc();
	}
	
}
