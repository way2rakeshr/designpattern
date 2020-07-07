package com.example.book;

public class Demo {
	public static void main(String[] args) {
		SingletonEager singleton = SingletonEager.getSingleton();
		System.out.println(singleton);
//		SingletonLazy singletonLazy=SingletonLazy.getSingleton();
//		System.out.println(singletonLazy);
//		SingletonSynchronised singletonSynchronised=SingletonSynchronised.getSingleton();
//		System.out.println(singletonSynchronised);
	}

}

class SingletonEager {
	private static SingletonEager instance = new SingletonEager();

	private SingletonEager() {
	}

	public static SingletonEager getSingleton() {
		return instance;
	}
}

class SingletonLazy {
	private static SingletonLazy instance = null;

	private SingletonLazy() {
	}

	public static SingletonLazy getSingleton() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}
/** to make thread safe*/
class SingletonSynchronised{
	private static SingletonSynchronised instance = null;
	private SingletonSynchronised (){
	}
	public static synchronized SingletonSynchronised getSingleton() {
		if (instance == null) {
			instance = new SingletonSynchronised();
		}
		return instance;
	}
}
