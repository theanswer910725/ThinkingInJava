package com.lin.reuseTest.d03;

/**
 * @Description 兽人
 * @ClassName {@link Villain}
 * @Author Lin.
 * @Date 2020年5月14日 下午9:13:32
 */
public class Orc extends Villain {

	private int orcNumber;

	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}

	public void change(String name, int orcNumber) {
		setName(name);
		this.orcNumber = orcNumber;
	}

	@Override
	public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}

	public static void main(String[] args) {
		Orc orc = new Orc("Footman", 12);
		System.out.println(orc);
		orc.change("Raider", 10);
		System.out.println(orc);
	}

}

/**
 * @Description 反面人物
 * @ClassName {@link Villain}
 * @Author Lin.
 * @Date 2020年5月14日 下午9:13:44
 */
class Villain {

	private String name;

	public Villain(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Villain name " + name;
	}

	protected void setName(String name) {
		this.name = name;
	}

}
