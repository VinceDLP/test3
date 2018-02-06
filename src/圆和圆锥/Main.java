package 圆和圆锥;

import java.util.Scanner;

class Circle {
	public static final double pi = 3.14;
	public double radius;

	Circle() {
		this(1);
	}

	Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double perimeter() {
		return 2 * pi * radius;
	}

	public double area() {
		return pi * radius * radius;
	}

	public void show() {
		System.out.printf("圆半径=%.2f,周长=%.2f,面积=%.2f", radius, perimeter(), area());
		System.out.println();
	}
}

class Cone extends Circle {
	private double height;

	Cone() {
		super.radius = 1;
		height = 1;
	}

	Cone(double radious, double height) {
		super.radius = radious;
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double surfaceArea() {
		return pi * radius * Math.sqrt(height * height + radius * radius) + pi * radius * radius;
	}

	public double volume() {
		return height * pi * radius * radius * 1 / 3;
	}

	public void show() {
		System.out.printf("\n圆锥底面圆半径=%.2f,周长=%.2f,面积=%.2f", radius, perimeter(), area());
		System.out.printf("\n圆锥高=%.2f,表面积=%.2f,体积=%.2f", height, surfaceArea(), volume());
		System.out.println();
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner xy = new Scanner(System.in);
		double r = xy.nextDouble();
		double h = xy.nextDouble();
		Circle c = new Circle(3);
		c.show();
		Cone cone1 = new Cone();
		cone1.show();
		Cone cone2 = new Cone(r, h);
		cone2.show();
		System.out.println();
		System.out.print("现在c引用的对象如下：");
		c = cone2;
		c.show();
	}
}
