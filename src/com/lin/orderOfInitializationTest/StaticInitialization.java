package com.lin.orderOfInitializationTest;

/**
 * @Description 静态数据初始化(注意：静态成员在类首次实例化后立即创建，再次实例化不再创建static成员变量)
 * <p>注意初始化执行顺序：静态成员 > 普通成员 > 构造器 > 方法</p>
 * <p>静态成员(只有首次实例化执行),普通成员(每次实例化都执行)</p>
 * @Author Lin.
 * @Date 2019年7月19日 下午4:35:13
 */
public class StaticInitialization {
	public static void main(String[] args) {
		System.out.println("======create new cupboard======");
		new Cupboard();
		System.out.println("======create new cupboard======");
		new Cupboard();
		table.f2(1);
		cupBoard.f3(1) ;
	}
	static Table table = new Table();
	static Cupboard cupBoard = new Cupboard();
}

class Bowl {
	Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}

	void f1(int marker) {
		System.out.println("f1(" + marker + ")");
	}
}

class Table {
	static Bowl bowl1 = new Bowl(1);

	Table() {
		System.out.println("Table()");
		bowl2.f1(1);
	}

	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}

	static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);

	Cupboard() {
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}

	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}

	static Bowl bowl5 = new Bowl(5);
}