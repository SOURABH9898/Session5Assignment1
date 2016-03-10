package com.acadglid.java.core.session5.assignment1;

import java.util.Scanner;

public class CalculateArea {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the length");
		int length=s.nextInt();
		System.out.println("Enter the breadth");
		int breadth=s.nextInt();
		Shape shape=new Rectangle();
		System.out.println("Area of "+shape.getClass().getName()+ " is: " + shape.area(length, breadth));
		System.out.println("Enter the base");
		int base=s.nextInt();
		System.out.println("Enter the height");
		int height=s.nextInt();
		shape=new Triangle();
		System.out.println("Area of "+ shape.getClass().getName()+" is: "+shape.area(base, height));
		
	}

}
