package com.lin.reuseTest;

/**
 * @Description 组合语法2
 * @ClassName {@link Bath}
 * @Author Lin.
 * @Date 2019年7月25日 下午9:30:34
 */
public class Bath {
	private String s1 = "Happy", s2 = "Happy", s3, s4;//定义的地方初始化
	private Soap castille;
	private int i;
	private float toy;

	public Bath() {
		System.out.println("Inside Bath()");
		s3 = "Joy";//构造器初始化
		toy = 3.14f;
		castille = new Soap();
	}
	
	{i = 47;}//实例初始化

	@Override
	public String toString() {
		if (s4 == null) { //延迟初始化(惰性初始化)
			s4 = "Joy";
		}
		return "s1=" + s1 + "\n" +
		 "s2=" + s2 + "\n" +
		 "s3=" + s3 + "\n" +
		 "s4=" + s4 + "\n" +
		 "i=" + i + "\n" + 
		 "toy=" + toy + "\n" +
		 "castille=" + castille;
	}
	
	public static void main(String[] args) {
		Bath b = new Bath();
		System.out.println(b);
	}
}

class Soap {
	private String s;

	Soap() {
		System.out.println("Soap()");
		s = "Constructed";
	}

	@Override
	public String toString() {
		return s;
	}
	
}