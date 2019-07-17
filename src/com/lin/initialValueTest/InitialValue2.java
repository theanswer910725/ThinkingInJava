package com.lin.initialValueTest;

/**
 * @Description 
 * @Author Lin.
 * @Date 2019年7月17日 下午10:08:38
 */
public class InitialValue2 {

	int i = 999;
	char c = 'x';
	byte b = 47;
	short s = 123;
	long l = 10000000;
	float f = 3.14f;
	double d = 3.14159d;
	boolean boo = true;
	Depth depth;
	public static void main(String[] args) {
		InitialValue2 iv2 = new InitialValue2();
		iv2.print();
	}
	
	public void print() {
		//depth 未初始化
		depth.testPrint();
	}
}

class Depth {
	public static void testPrint() {
		System.out.println("testPrint() invoke");
	}
}

class MethodIn {
	int i = f();
	int j = g(i);
	//int s = g(s);
	
	int f() {
		return 11;
	}
	
	int g(int ii) {
		return ii + 10;
	}
}
