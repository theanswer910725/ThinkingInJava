package com.lin.orderOfInitializationTest;

/**
 * @Description 实例块
 * <p>和静态块不同，每创建一次对象都会执行实例块</p>
 * @Author Lin.
 * @Date 2019年7月19日 下午10:10:02
 */
public class Mugs {

	Mug mug1;
	Mug mug2;
	
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("{} invoke");
	}

	public Mugs() {
		System.out.println("Mugs()");
	}
	
	public Mugs(int marker) {
		System.out.println("Mugs("+marker+")");
	}
	
	public static void main(String[] args) {
		Mugs mugs = new Mugs();
		Mugs mugs1 = new Mugs(1);
	}
}

class Mug {
	
	public Mug(int marker) {
		System.out.println("Mug(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
	
}
