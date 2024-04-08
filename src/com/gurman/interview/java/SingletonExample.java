package com.gurman.interview.java;

public class SingletonExample {

	private static SingletonExample instance;

	private SingletonExample() {
		System.out.println("Private Constructor");
	}

	public static SingletonExample getInstance() {
		if (instance == null) {
			synchronized (SingletonExample.class) {
				if (instance == null) {
					instance = new SingletonExample();
				}
			}
		}
		return instance;
	}
}
