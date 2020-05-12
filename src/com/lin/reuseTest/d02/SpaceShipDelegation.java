package com.lin.reuseTest.d02;

/**
 * @Description 太空船代理类
 * @ClassName {@link SpaceShipDelegation}
 * @Author Lin.
 * @Date 2020年5月8日 下午10:39:50
 */
public class SpaceShipDelegation {
	
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	
	public void up(int velocity) {
		controls.up(velocity);
	}
	
	public void down(int velocity) {
		controls.down(velocity);
	}
	
	//....
	
	public static void main(String[] args) {
		SpaceShipDelegation delegation = new SpaceShipDelegation("Tiangong 1");
		delegation.up(100);
	}

}
