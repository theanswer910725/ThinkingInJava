package com.lin.reuseTest.d02;

/**
 * @Description 太空船
 * @ClassName {@link SpaceShip}
 * @Author Lin.
 * @Date 2020年5月8日 下午10:31:55
 */
public class SpaceShip {

	private String name;

	public SpaceShip(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		return name;
	}

}