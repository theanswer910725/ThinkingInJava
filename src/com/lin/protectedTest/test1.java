package com.lin.protectedTest;

public class test1 {
	private String privateStr;
	public String publicStr;
	protected String protectedStr;
	String friendlyStr;//默认权限friendly。包内可访问，包外不可访问，不管是子类还是没有继承关系的类。
	
	private void privateMethod() {
		System.out.println("Inovke private Method!");
	}
	
	public void publicMethod() {
		System.out.println("Inovke public Method!");
	}
	
	protected void protectedMethod() {
		System.out.println("Inovke protected Method!");
	}
	
	void friendlyMethod() {
		System.out.println("Inovke friendly Method!");
	}
	
	public static void main(String[] args) {
		test1 obj = new test1();
		obj.privateStr = "";
		obj.privateMethod();
	}
}
