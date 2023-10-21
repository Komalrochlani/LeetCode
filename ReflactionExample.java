package com.code.interviewprepration;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Friend{
	int x;
	
	private void display() {
		System.out.println("this is display");
	}
}

public class ReflactionExample {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException {
		Friend f = new Friend();
		Class<? extends Friend> c = f.getClass();
		Field[] fields = c.getDeclaredFields();
		System.out.println(c.getDeclaredField("x"));
		System.out.println(fields[0].getName());
		
		Method[] m = c.getDeclaredMethods();
		System.out.println(m[0].getName());
		System.out.println(m[0].getReturnType());
		c.getDeclaredConstructor().newInstance();
		m[0].setAccessible(true);
		m[0].invoke(c.getDeclaredConstructor().newInstance(), null);
	}
}
