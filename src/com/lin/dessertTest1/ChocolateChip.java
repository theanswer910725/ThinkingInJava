package com.lin.dessertTest1;

import com.lin.dessertTest.Cookie;

/**
 * @Description protected测试
 * @ClassName {@link ChocolateChip}
 * @Author Lin.
 * @Date 2019年7月24日 下午9:21:32
 */
public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}

	public void chomp() {
		//this.bite() // 包访问权限无法跨包访问,不允许进行类扩展
		this.bite1(); //受保护权限子类可调用,允许进行类扩展
	}
	
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
	}
}
