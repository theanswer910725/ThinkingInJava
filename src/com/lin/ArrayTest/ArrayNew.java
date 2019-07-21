package com.lin.ArrayTest;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {

	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		System.out.println("length of a=" + a.length);
		System.out.println(Arrays.toString(a));
	}
}
