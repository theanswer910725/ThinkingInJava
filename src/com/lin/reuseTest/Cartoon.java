package com.lin.reuseTest;

/**
 * @Description 漫画
 * @ClassName {@link Cartoon}
 * @Author Lin.
 * @Date 2019年7月25日 下午9:52:31
 */
public class Cartoon extends Drawing {
	public Cartoon() {
		System.out.println("Cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon cartoon = new Cartoon();
		//如果类有继承关系则会优先调用父类构造器再调用子类构造器
	}
}

/**
 * @Description 绘画
 * @ClassName {@link Drawing}
 * @Author Lin.
 * @Date 2019年7月25日 下午9:53:14
 */
class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}

class Art {
	public Art() {
		System.out.println("Art constructor");
	}
}
