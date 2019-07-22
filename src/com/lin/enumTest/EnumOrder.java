package com.lin.enumTest;

/**
 * @Description 依据序号获取枚举
 * @Author Lin.
 * @Date 2019年7月22日 下午10:03:21
 */
public class EnumOrder {
	public static void main(String[] args) {
		for (Spiciness s : Spiciness.values()) {
			System.out.println(s + " ordinal:" + s.ordinal());
		}
	}
}
