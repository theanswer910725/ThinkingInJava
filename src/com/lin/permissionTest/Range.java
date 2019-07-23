package com.lin.permissionTest;

/**
 * @Description 使用fatjar进行打包后生成jar进行引用测试
 * @ClassName {@link Range}
 * @Author Lin.
 * @Date 2019年7月23日 下午11:08:59
 */
public class Range {
	public static int[] range(int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = i;
		}
		return result;
	}

	public static int[] range(int start, int end) {
		int sz = end - start;
		int[] result = new int[sz];
		for (int i = 0; i < sz; i++) {
			result[sz] = start + i;
		}
		return result;
	}

	public static int[] range(int start, int end, int step) {
		int sz = (end - start) / step;
		int[] result = new int[sz];
		for (int i = 0; i < sz; i++) {
			result[sz] = start + i * step;
		}
		return result;
	}
}
