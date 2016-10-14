package com.bayviewglen.daysix;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		double l = 4.5;
		double w = 2.3;
		
		double area = (l * w);
		double perimeter = ( 2*w + 2*l);
		
		double areaRounded = (int)(area * 10)/10.0;
		double perimeterRounded = (int)(perimeter * 10)/10.0;
		
		System.out.println ("The area is: " + areaRounded);
		System.out.println ("The perimeter is: " +  perimeterRounded);
	}

}
