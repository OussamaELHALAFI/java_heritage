package com.esisa.java.heritage;

import java.awt.Color;

public class Main {
	public Main() {
		exp11();
	}
	
	void exp01() {
		Point p1 = new Point(20, 43);
		p1.print();
	}
	
	void exp02() {
		Pixel p1 = new Pixel();
		p1.setX(42);
		p1.setY(65);
		p1.print();
	}
	
	void exp03() {
		Pixel p1 = new Pixel(20, 43);
		p1.print();
	}
	
	void exp04() {
		Pixel p1 = new Pixel(43, 52, Color.BLUE);
		p1.print();
	}
	
	void exp05() {
		Pixel fille = new Pixel(43, 52, Color.BLUE);
		Point mere = fille; // affectation fille mere
		
		mere.print();
		System.out.println(mere.getClass().getSimpleName());
		mere = new Point();
		mere.print();
	}
	
	void exp06() {
		Point p1 = new Point(20, 43);
		Point p2 = new Point(20, 43);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}
	
	void exp07() {
		Pixel fille1 = new Pixel(20, 30, Color.BLUE);//Affectation fille -> mere
		Point mere1 = fille1;
		Point mere2 = new Point(20, 30);
		
		Pixel fille2 = (Pixel)mere1;
		fille2.print();
		
	}
	
	void exp08() {
		Pixel p1 = new Pixel(20, 30, Color.BLUE);
		Pixel p2 = new Pixel(20, 30, Color.BLUE);
		System.out.println(p1.equals(p2));
	}
	
	void exp09() {
		DataManger dm = new DataManger();
		//dm.setLogger(new ConsoleLogger());
		SwingLogger swing = new SwingLogger();
		dm.setLogger(swing);
		dm.insert("FORTRAN");
		dm.insert("COBOL");
		dm.insert("C++");
		dm.insert("JAVA");
		System.out.println(dm.select(1));
		dm.insert("C#");
		System.out.println(dm.select(3));
		dm.delete(0);
		dm.print();
		
		swing.setVisible(true);
	}
	
	void exp10() {
		int x = 0;
		int y = 0;
		try {
		y=20/x;
		}
		catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		System.out.println(" y = " + y);
	}

	void exp11() {
		DataManger dm = new DataManger();
		FileLogger file = new FileLogger("recources/log.txt");
		dm.setLogger(file);
		dm.insert("FORTRAN");
		dm.insert("COBOL");
		dm.insert("C++");
		dm.insert("JAVA");
		System.out.println(dm.select(1));
		dm.insert("C#");
		System.out.println(dm.select(3));
		dm.delete(0);
		dm.print();
		
		file.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
