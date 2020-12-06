package com.esisa.java.heritage;

import java.awt.Color;

import javax.swing.JOptionPane;

public class Pixel extends Point {
	private Color color;

	public Pixel(Color color) {
		super();
		this.color = color;
	}

	public Pixel(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	public Pixel() {
		super();
		color = new Color(255, 0, 0);
	}

	public Pixel(int x, int y) {
		super(x, y);
		color = color.BLACK;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public void print() {
		JOptionPane.showMessageDialog(null, "Pixel(" + getX() + ", " + getY() + ", " + color + ")");
	}
}
