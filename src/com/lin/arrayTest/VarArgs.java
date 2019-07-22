package com.lin.arrayTest;

/**
 * @Description 可变参数列表
 * @Author Lin.
 * @Date 2019年7月22日 下午7:11:04
 */
public class VarArgs {

	public static void main(String[] args) {
		printArray(new Integer(4), new Float(3.14), new Double(11.11));
		printArray(); 
		printArray(47, 3.14f, 11.11);
		printArray("t","e","s","t");
		printArray((Object[])new Integer[] {1,2,3});
	}

	static void printArray(Object... args) {
		for (Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
