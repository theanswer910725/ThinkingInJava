package com.lin.dessertTest1;

/**
 * @Description 圣代(工厂模式构建)
 * @ClassName {@link Sundae}
 * @Author Lin.
 * @Date 2019年7月24日 下午9:14:43
 */
public class Sundae {

	private Sundae() {}
	
	static Sundae getSundae() {
		return new Sundae();
	}
}
