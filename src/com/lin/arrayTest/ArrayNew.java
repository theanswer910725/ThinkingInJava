package com.lin.arrayTest;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {

	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		System.out.println("length of a=" + a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(500);
		}
		System.out.println(Arrays.toString(a));
	}
}
