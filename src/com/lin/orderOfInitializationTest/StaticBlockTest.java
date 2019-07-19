package com.lin.orderOfInitializationTest;

/**
 * @Description 静态块(静态子句)初始化
 * <p>和静态成员一样，只有首次访问才会执行静态块(首次访问包括StaticBlockTest.对象 或者实例化对象两种)</p>
 * @Author Lin.
 * @Date 2019年7月19日 下午9:47:24
 */
public class StaticBlockTest {

	public static void main(String[] args) {
		//tips:情况1，2分开运行观察
		
		//情况1:首次访问类中静态成员对象
		System.out.println("main()");
		Cups.cup1.f(99);
		//注意Cups构造器此时并没有执行
		System.out.println("==============");
		Cups cups = new Cups();
		//实例化对象cups构造器才被调用
		
		//情况2：首次实例化对象
		//Cups cups1 = new Cups();
		//System.out.println("==============");
		//Cups cups2 = new Cups();//第2次实例化类对象静态块并没有执行
	}
}

class Cup {
	Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	Cups() {
		System.out.println("Cups()");
	}
}