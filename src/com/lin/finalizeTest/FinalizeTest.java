package com.lin.finalizeTest;

public class FinalizeTest {

	public static void main(String[] args) {
		ClassA aObj = new ClassA("Tom");
	}
	
}

class ClassA {

	String name = "";

	ClassA (String name) {
		this.name = name;
	}

	/**
	 * JVM不会立即清理对象，print不会立即执行
	 */
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(name + " destroyed!");
	}

}