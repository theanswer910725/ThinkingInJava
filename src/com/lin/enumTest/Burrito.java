package com.lin.enumTest;

/**
 * @Description 卷饼
 * @Author Lin.
 * @Date 2019年7月22日 下午10:08:05
 */
public class Burrito {
	Spiciness degree;

	public Burrito(Spiciness degree) {
		this.degree = degree;
	}

	public void desc() {
		System.out.print("This burrito is:");
		switch (degree) {
		case NOT:
			System.out.println("not spicy at all.");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot.");
			break;
		case HOT:
		case FLAMING:
		default:
			System.out.println("maybe too hot.");
			break;
		}
	}
	
	public static void main(String[] args) {
		Burrito 
			plain = new Burrito(Spiciness.NOT),
			greenChile = new Burrito(Spiciness.MILD),
			jalapeno = new Burrito(Spiciness.FLAMING);
		plain.desc();
		greenChile.desc();
		jalapeno.desc();
	}
}
