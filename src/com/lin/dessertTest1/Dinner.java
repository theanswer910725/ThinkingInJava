package com.lin.dessertTest1;

import com.lin.dessertTest.Cookie;

/**
 * @Description 权限访问修饰词2，public测试
 * @ClassName {@link Dinner}
 * @Author Lin.
 * @Date 2019年7月24日 下午9:05:16
 */
public class Dinner {

	public static void main(String[] args) {
		Cookie x = new Cookie();
		// x.bite() //bite()是包访问权限，无法调用
	}
}
