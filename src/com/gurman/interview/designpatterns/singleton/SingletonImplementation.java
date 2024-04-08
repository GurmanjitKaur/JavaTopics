package com.gurman.interview.designpatterns.singleton;

public class SingletonImplementation {
	
	private static SingletonImplementation instance = null;

	private SingletonImplementation() {
	}
	
	public SingletonImplementation getInstance() {
		if(instance == null) {
			synchronized (instance) {
				if(instance == null) {
					return new SingletonImplementation();
				}
			}
		}
		return instance;
	}
	
	

}
