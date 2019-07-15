package com.lin.initialValueTest;

/**
 * @Description 测试基本数据类型初始化
 * @Author Lin.
 * @Date 2019年7月15日 下午9:10:24
 */
public class InitialValue {

	int i;
	char c;
	byte b;
	short s;
	long l;
	float f;
	double d;
	boolean boo;

	public static void main(String[] args) {
		InitialValue iv = new InitialValue();
		iv.printDefaultValue();
	}

	public void printDefaultValue() {
		System.out.println("int:" + i);
		System.out.println("char:" + c);
		System.out.println("byte:" + b);
		System.out.println("short:" + s);
		System.out.println("long:" + l);
		System.out.println("float:" + f);
		System.out.println("double:" + d);
		System.out.println("boolean:" + boo);
	}
}
