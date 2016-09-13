package com.bayviewglen.daythree;

public class HomeworkSix {

	public static void main(String[] args) {
		//y = ax2+bx+c 
		
		double a = 2;
		double b = 4;
		double c = 1;
		
		double rootOne;
		double rootTwo;
		
		rootOne = (-b + Math.sqrt (b*b - 4*a*c)/(2*a));
		rootTwo = (-b - Math.sqrt (b*b - 4*a*c)/(2*a));
		
		System.out.println("The roots are: " + rootOne + " and " + rootTwo);
		

	}

}
