package com.lin.enumTest;

import com.lin.enumTest.Coffee2.CoffeeSize2;

/**
 * @Description 咖啡豆测试
 * @Author Lin.
 * @Date 2019年7月22日 下午10:18:30
 */
public class CoffeeTest {

	public static void main(String[] args) {
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.HUGE;
		Coffee2 drink2 = new Coffee2();
		drink2.size = CoffeeSize2.Coffee2_BIG;
	}
}

enum CoffeeSize {
	BIG, HUGE, OVERWHELMING
}

class Coffee {
	CoffeeSize size;
}

class Coffee2 {
	enum CoffeeSize2 {
		Coffee2_BIG, Coffee2_OVERWHELMING, Coffee2_HUGE
	}

	CoffeeSize2 size;
}
