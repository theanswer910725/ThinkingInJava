package com.lin.permissionTest;

import java.io.PrintStream;

/**
 * @Description 使用fatjar进行打包后生成jar进行引用测试
 * @ClassName {@link Print}
 * @Author Lin.
 * @Date 2019年7月23日 下午11:09:47
 */
public class Print {
	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void print() {
		System.out.println();
	}

	public static void printnb(Object obj) {
		System.out.print(obj);
	}

	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}
}
