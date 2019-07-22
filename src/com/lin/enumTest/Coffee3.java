package com.lin.enumTest;

public class Coffee3 {

	CoffeeSize3 size;

	public static void main(String[] args) {
		Coffee3 drink = new Coffee3();
		drink.size = CoffeeSize3.HUGE;
		System.out.println(drink.size.getOunces());
	}
}

enum CoffeeSize3 {
	BIG(8), HUGE(10), OVERWHELMING(16);

	private int ounces;

	CoffeeSize3(int ounces) {
		this.ounces = ounces;
	}

	public int getOunces() {
		return ounces;
	}
}