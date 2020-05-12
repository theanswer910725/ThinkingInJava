package com.lin.reuseTest.d02;

public class PlaceSetting extends Custom {
	
	private Spoon spoon;
	private Fork fork;
	private Knife knife;
	private DinnerPlate dinnerPlate;
	
	public PlaceSetting(int i) {
		super(i + 1);
		spoon = new Spoon(i + 2);
		fork = new Fork(i + 3);
		knife = new Knife(i + 4);
		dinnerPlate = new DinnerPlate(i + 5);
		System.out.println("PlaceSetting constructor");
	}

	public static void main(String[] args) {
		//注意实例化顺序
		PlaceSetting placeSetting = new PlaceSetting(1);
	}
}

/**
 * @Description 盘子
 * @ClassName {@link Plate}
 * @Author Lin.
 * @Date 2020年5月9日 下午11:12:23
 */
class Plate {
	Plate(int i) {
		System.out.println("Plate constructor");
	}
}

/**
 * @Description 餐盘
 * @ClassName {@link DinnerPlate}
 * @Author Lin.
 * @Date 2020年5月9日 下午11:13:20
 */
class DinnerPlate extends Plate {

	DinnerPlate(int i) {
		super(i);
		System.out.println("DinnerPlate constructor");
	}
}

/**
 * @Description 餐具
 * @ClassName {@link Utensil}
 * @Author Lin.
 * @Date 2020年5月9日 下午11:13:49
 */
class Utensil {

	Utensil(int i) {
		System.out.println("Utensil constructor");
	}
}

/**
 * @Description 勺子
 * @ClassName {@link Spoon}
 * @Author Lin.
 * @Date 2020年5月9日 下午11:18:17
 */
class Spoon extends Utensil {

	Spoon(int i) {
		super(i);
		System.out.println("Spoon constructor");
	}
}

/**
 * @Description 叉子
 * @ClassName {@link Fork}
 * @Author Lin.
 * @Date 2020年5月9日 下午11:19:04
 */
class Fork extends Utensil {

	Fork(int i) {
		super(i);
		System.out.println("Fork constructor");
	}
}

/**
 * @Description 刀子
 * @ClassName {@link Knife}
 * @Author Lin.
 * @Date 2020年5月9日 下午11:19:42
 */
class Knife extends Utensil {
	
	Knife(int i) {
		super(i);
		System.out.println("Knife constructor");
	}
}

/**
 * @Description 顾客
 * @ClassName {@link Custom}
 * @Author Lin.
 * @Date 2020年5月9日 下午11:20:32
 */
class Custom {
	
	Custom(int i) {
		System.out.println("Custom constructor");
	}
}