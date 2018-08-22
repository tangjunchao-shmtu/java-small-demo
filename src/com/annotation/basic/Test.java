package com.annotation.basic;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@TestAnnotion(msg="hello")
public class Test {
	
	@Check(value="hi")
	int a;
	
	@Perform
	public void testMethod() {};
	
	@SuppressWarnings("deprecation")
	public void test1() {
		Hero hero = new Hero();
		hero.say();
		hero.speak();
	}
	
	public static void main(String[] args) {
		
		boolean hasAnnotion = Test.class.isAnnotationPresent(TestAnnotion.class);
		
		if(hasAnnotion) {
			
			TestAnnotion testAnnotion = Test.class.getAnnotation(TestAnnotion.class);
			
			System.out.println("id:" + testAnnotion.id());
			
			System.out.println("msg:" + testAnnotion.msg());
		}
		
		try {
			Field a = Test.class.getDeclaredField("a");
			a.setAccessible(true);
			Check check = a.getAnnotation(Check.class);
			if(check != null) {
				System.out.println("check value:" + check.value());
			}
			
			Method testMethod = Test.class.getDeclaredMethod("testMethod");
			if(testMethod != null) {
				Annotation[] ans = testMethod.getAnnotations();
				for (int i = 0; i < ans.length; i++) {
					System.out.println("testMethod annotation:" +
							ans[i].annotationType().getSimpleName());
				}
			}
			
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
