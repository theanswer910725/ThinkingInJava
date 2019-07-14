package com.lin.loopTest;

public class TestContinue {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		TestContinue tc = new TestContinue();
		tc.loopTest();
	} 

	public void loopTest() {
		loop: 
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.println("for loop");
					continue loop;
				}
			}
	System.out.println(Math.random());
	}
}
