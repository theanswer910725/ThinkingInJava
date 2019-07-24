package com.lin.dessertTest1;

/**
 * @Description 类的访问权限测试
 * @ClassName {@link Launch}
 * @Author Lin.
 * @Date 2019年7月24日 下午11:38:50
 */
public class Launch {
	void testPrivate() {
		//Soup1 soup1 = new Soup1();
	}
	
	void testStatic() {
		Soup1 soup1 = Soup1.makeSoup();
	}
	
	/**
	 * @Description 使用soup2对象操作Soup2类的num对象后使用soup3对象输出，结果为改变后的值。可知soup2和soup3在内存中指向同一地址
	 * @param:       
	 * @return: void 
	 * @Author Lin.
	 * @Date 2019年7月25日 上午12:13:58
	 */
	void testSingleton() {
		Soup2 soup2 = Soup2.access();
		soup2.setNum(5);
		Soup2 soup3 = Soup2.access();
		System.out.println(soup3.getNum());
		if (soup2.equals(soup3)) {
			System.out.println("soup2和soup3指向同一对象");
		} else {
			System.out.println("soup2和soup3不是同一对象");
		}
	}
	
	public static void main(String[] args) {
		Launch l = new Launch();
		l.testSingleton();
	}
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
	private int num = 0;
	private Soup2() {}
	private static Soup2 ps1 = new Soup2();//创建一个私有的静态对象，整个周期只会new一次。不管多少人用，操作的都是同一个对象，即单例模式
	public static Soup2 access() {
		return ps1;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
