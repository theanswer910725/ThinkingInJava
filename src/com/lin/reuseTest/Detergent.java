package com.lin.reuseTest;

/**
 * @Description 洗涤剂(继承测试)
 * @ClassName {@link Detergent}
 * @Author Lin.
 * @Date 2019年7月25日 下午9:33:21
 */
public class Detergent extends Cleanser {

	@Override
	public void scrub() {
		append("Detergent.scrub()");
		super.scrub();
	}
	
	/**
	 * @Description 泡沫
	 * @param:       
	 * @return: void 
	 * @Author Lin.
	 * @Date 2019年7月25日 下午9:44:30
	 */
	public void foam() {
		append(" foam() ");
	}
	
	public static void main(String[] args) {
		Detergent d = new Detergent();
		d.dilute();
		d.apply();
		d.scrub();
		d.foam();
		System.out.println(d);
		System.out.println("Testing base class.");
		Cleanser.main(args);
	}
}

/**
 * @Description 去污粉
 * @ClassName {@link Cleanser}
 * @Author Lin.
 * @Date 2019年7月25日 下午9:34:50
 */
class Cleanser {
	private String s = "Cleanser";

	/**
	 * @Description 添加
	 * @param:
	 * @return: void
	 * @Author Lin.
	 * @Date 2019年7月25日 下午9:35:15
	 */
	public void append(String a) {
		s += a;
	}

	/**
	 * @Description 稀释
	 * @param:
	 * @return: void
	 * @Author Lin.
	 * @Date 2019年7月25日 下午9:35:53
	 */
	public void dilute() {
		append(" dilute() ");
	}

	/**
	 * @Description 应用
	 * @param:
	 * @return: void
	 * @Author Lin.
	 * @Date 2019年7月25日 下午9:37:27
	 */
	public void apply() {
		append(" apply() ");
	}

	/**
	 * @Description 擦洗
	 * @param:
	 * @return: void
	 * @Author Lin.
	 * @Date 2019年7月25日 下午9:38:33
	 */
	public void scrub() {
		append(" scrub() ");
	}

	@Override
	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}
