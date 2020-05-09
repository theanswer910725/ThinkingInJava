package com.lin.reuseTest.d01;

/**
 * @Description 喷水器(组合语法)
 * @ClassName {@link SpinklerSystem}
 * @Author Lin.
 * @Date 2019年7月25日 下午8:45:58
 */
public class SprinklerSystem {

	private String value1, value2, value3, value4;
	private WaterSource source = new WaterSource();// 把一个类放到另外一个类中作为一个对象去使用叫组合
	private int i;
	private float f;
	
	@Override
	public String toString() {
		return "value1=" + value1 + " " +
			   "value2=" + value2 + " " +
			   "value3=" + value3 + " " +
			   "value4=" + value4 + " " +
			   "i=" + i + " f=" + f + " source=" + source;
	}


	public static void main(String[] args) {
		SprinklerSystem sprinklerSystem = new SprinklerSystem();
		System.out.println(sprinklerSystem);
	}
}

class WaterSource {
	private String s;

	WaterSource() {
		System.out.println("WaterSource constructor");
		s = "Constructored";
	}

	@Override
	public String toString() {
		return s;
	}

}