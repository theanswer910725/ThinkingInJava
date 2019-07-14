package com.lin.protectedTest;

public class test2 {
	
	public static void main(String[] args) {
		test1 obj = new test1();
		//无法调用private
		obj.friendlyStr = "friendly";
		obj.protectedStr = "protected";
		obj.publicStr = "public";
		obj.friendlyMethod();
		obj.publicMethod();
		obj.protectedMethod();
	}
}
