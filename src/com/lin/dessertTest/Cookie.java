package com.lin.dessertTest;

/**
 * @Description 权限修饰词
 * @ClassName {@link Cookie}
 * @Author Lin.
 * @Date 2019年7月24日 下午9:01:18
 */
public class Cookie {

	public Cookie() {
		System.out.println("Cookie constructor.");
	}

	// 包访问权限等级
	void bite() {
		System.out.println("bite()");
	}

	// 受保护的
	protected void bite1() {
		System.out.println("protected bite1()");
	}
}
