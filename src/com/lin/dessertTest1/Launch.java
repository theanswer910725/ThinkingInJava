package com.lin.dessertTest1;

/**
 * @Description 类的访问权限测试
 * @ClassName {@link Launch}
 * @Author Lin.
 * @Date 2019年7月24日 下午11:38:50
 */
public class Launch {

}

class Soup1 {
	private Soup1() {} // 私有构造器

	// 一般情况下，构造器如果是私有的，那么获取对象的方法一般都做成公共的静态的(public static)
	//否则无法获取该类的实例对象
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

//单例模式
class Soup2 {
	private Soup2() {}
	private static Soup2 ps1 = new Soup2();//创建一个私有的静态对象，整个周期只会new一次。不管多少人用，操作的都是同一个对象，即单例模式
	public static Soup2 access() {
		return ps1;
	}
}
