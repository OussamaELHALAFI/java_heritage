package com.esisa.java.heritage;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [" + x + ", " + y + "]";
	}
	
	public void print() {
		System.out.println(toString());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj;
			if(p.x == x && p.y == y) {
				return true;
			}
			return false;
		}
		else {
			return false;
		}
	}
}
