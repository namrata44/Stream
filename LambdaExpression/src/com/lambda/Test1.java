package com.lambda;

public class Test1 {
	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Functional Interface.");
			}
		}).start();
	}
}
