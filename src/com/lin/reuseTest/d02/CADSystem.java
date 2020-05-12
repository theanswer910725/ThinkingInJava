package com.lin.reuseTest.d02;

public class CADSystem extends Shape {

	private Circle circle;
	private Triangle triangle;

	public CADSystem() {
		super();
		circle = new Circle();
		triangle = new Triangle();
		System.out.println("CADSystem constructor");
	}

	public static void main(String[] args) {
		CADSystem cad = new CADSystem();
		cad.dispose();
	}

	
	public void dispose() {
		System.out.println("dispose CAD");
		triangle.dispose();
		circle.dispose();
	}
}

class Shape {
	public Shape() {
		System.out.println("Shape constructor");
	}

	void distroy() {
		System.out.println("Shape distory");
	}
}

class Circle extends Shape {
	public Circle() {
		super();
		System.out.println("circle constructor");
	}

	void dispose() {
		System.out.println("dispose Circle");
		super.distroy();
	}
}

class Triangle extends Shape {
	public Triangle() {
		super();
		System.out.println("drawing triangle");
	}

	void dispose() {
		System.out.println("dispose triangle");
		super.distroy();
	}
}