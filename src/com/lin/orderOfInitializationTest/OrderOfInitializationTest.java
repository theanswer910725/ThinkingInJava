package com.lin.orderOfInitializationTest;

/**
 * @Description 构造器初始化（先初始化实例成员后初始化构造器）
 * @Author Lin.
 * @Date 2019年7月19日 下午4:05:57
 */
public class OrderOfInitializationTest {

	public static void main(String[] args) {
		House h = new House();
		h.f();
	}
}

class Window {
	Window(int marker) {
		System.out.println("Window(" + marker + ")");
	}
}

class House {
	Window w1 = new Window(1);

	House() {
		System.out.println("House()");
		w3 = new Window(33);
	}

	Window w2 = new Window(2);

	void f() {
		System.out.println("f()");
	}

	Window w3 = new Window(3);
}
