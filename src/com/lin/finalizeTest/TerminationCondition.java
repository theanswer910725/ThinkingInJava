package com.lin.finalizeTest;

/**
 * 终止条件测试
 * 
 * @author Lin.
 * @date 2019年7月14日 下午7:43:22
 */
public class TerminationCondition {

	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}
}

class Book {

	boolean checkOut = false;

	Book(boolean checkOut) {
		this.checkOut = checkOut;
	}

	void checkIn() {
		checkOut = false;
	}

	@Override
	protected void finalize() throws Throwable {
		if (checkOut) {
			System.out.println("Error: check out");
		}
		super.finalize();
	}

}
