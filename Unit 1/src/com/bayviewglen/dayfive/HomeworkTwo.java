package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("What is your test out of?");
		x = keyboard.nextInt ();
		
		System.out.println("What did you get on your test?");
		y = keyboard.nextInt();
		double answer = ((double)y/x)*100;
		
		System.out.println("Great, you got " + answer);

	}

}
