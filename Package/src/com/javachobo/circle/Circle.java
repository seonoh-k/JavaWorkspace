package com.javachobo.circle;

public class Circle {

	private int x;
	private int y;
	private int r;
	final private double PI = 3.14;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public double getArea() {
		return r * r * PI;
	}
}
