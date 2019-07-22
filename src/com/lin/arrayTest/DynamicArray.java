package com.lin.arrayTest;

/**
 * @Description Don't do this.
 * @Author Lin.
 * @Date 2019年7月22日 下午7:10:22
 */
public class DynamicArray {
	public static void main(String[] args) {
		Other.main(new String[] { "fiddle", "de", "dum" });
	}
}

class Other {
	public static void main(String[] args) {
		for (String string : args) {
			System.out.print(string + " ");
		}
	}
}
