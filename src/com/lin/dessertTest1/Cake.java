package com.lin.dessertTest1;

/**
 * @Description 蛋糕
 * @ClassName {@link Cake}
 * @Author Lin.
 * @Date 2019年7月24日 下午9:08:51
 */
public class Cake {
	public static void main(String[] args) {
		Pie x = new Pie();
		x.f();//f()包访问权限，同包可访问
	}
}
