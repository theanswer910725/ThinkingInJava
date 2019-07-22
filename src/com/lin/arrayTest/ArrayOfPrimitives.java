package com.lin.arrayTest;

/**
 * @Description 数组初始化
 * @Author Lin.
 * @Date 2019年7月21日 下午11:50:18
 */
public class ArrayOfPrimitives {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2;
		a2 = a1;
		for (int i = 0; i < a2.length; i++) {
			a2[i]++;
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.println("a1[" + i + "]=" + a1[i]);
		}
	}
}
