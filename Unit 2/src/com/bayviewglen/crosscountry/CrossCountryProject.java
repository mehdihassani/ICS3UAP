package com.bayviewglen.crosscountry;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryProject {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		final int MIN_TO_SEC = 60;
		String divider = ("************************************");
		DecimalFormat formatter = new DecimalFormat ("00.000");
		
		
		System.out.print("Please enter your first and last name: ");
		String name1 = keyboard.nextLine();
		String Firstname1 = name1.split(" ")[0];
		String Lastname1 = name1.split(" ") [1];
		
		//***************Runner 1******************
		System.out.print(Firstname1 + ", please enter your first mile: (MM:SS.SSS)");
		String time1 = keyboard.nextLine();
		
		System.out.print(Firstname1 + ", please enter your second mile: (MM:SS.SSS)");
		String time2 = keyboard.nextLine ();
		
		System.out.print("Please print your time to complete 5KM: (MM:SS.SSS)");
		String timefinal = keyboard.nextLine ();
		
		//split No.1 for Runner N0.1
		int Min1 = Integer.parseInt(time1.split(":")[0]);
		double Sec1 = Double.parseDouble(time1.split(":")[1]);
		double TotalSec1 = (Min1 * MIN_TO_SEC) + Sec1;								//Split one time in Seconds 
		String Split1 = Double.toString(Sec1);										//TOTAL
		Split1 = formatter.format(Sec1);
		//End of Split No.1 for Runner No.1
		
		
		//Split No.2 For Runner No.1
		int Min2 = Integer.parseInt(time2.split(":")[0]);
		double Sec2 = Double.parseDouble(time2.split(":")[1]);
		double TotalSec2 = (Min2 * MIN_TO_SEC) + Sec2;								//Split two time in seconds
		int Split2Min = (int)(TotalSec2 - TotalSec1) / MIN_TO_SEC;					//Mile 2's minutes
		double Split2Sec = (TotalSec2 - TotalSec1) % MIN_TO_SEC;					//Mile 2's seconds
		String Split2T = Double.toString(Split2Sec);
		Split2T = formatter.format(Split2Sec);
		//End of Split No.2 For Runner No.1
		
		//Split No.3 for Runner No.1
		int Min3 = Integer.parseInt(timefinal.split(":")[0]);
	    double Sec3 = Double.parseDouble(timefinal.split(":")[1]);
		double TotalSec3 = (Min3 * MIN_TO_SEC) + Sec3;								//Split three time in seconds
		int Split3Min = (int)(TotalSec3 - TotalSec2) / MIN_TO_SEC;					//Mile 3's minutes
		double Split3Sec = (TotalSec3 - TotalSec2) % MIN_TO_SEC;					//Mile 3's seconds
		String Split3T = Double.toString(Split3Sec);
		Split3T = formatter.format(Split3Sec);
		//End of Split No.3 for Runner No.1
		
		System.out.println();
		System.out.println();
		System.out.println("Runner one Summary: " + name1);
		System.out.println(divider);
		System.out.println("" + name1 + "'s Split 1 time: " + Min1 + ":" + Split1);
		System.out.println("" + name1 + "'s Split 2 time: " + Split2Min + ":" + Split2T);
		System.out.println("" + name1 + "'s Split 3 time: " + Split3Min + ":" + Split3T);
		System.out.println();
		System.out.println();
		
	
		//*******************RUNNER 2*******************
		System.out.print("Please enter your first and last name: ");
		String name2 = keyboard.nextLine();
		String Firstname2 = name2.split(" ")[0];
		String Lastname2 = name2.split(" ") [1];
				
		System.out.print(Firstname2 + ", please enter your first mile: (MM:SS.SSS)");
		String TWOtime1 = keyboard.nextLine();
				
		System.out.print(Firstname2 + ", please enter your second mile: (MM:SS.SSS)");
		String TWOtime2 = keyboard.nextLine ();
				
		System.out.print("Please print your time to complete 5KM: (MM:SS.SSS)");
		String TWOtimefinal = keyboard.nextLine ();
				
		//split No.1 for Runner N0.2
		int TWOMin1 = Integer.parseInt(TWOtime1.split(":")[0]);
		double TWOSec1 = Double.parseDouble(TWOtime1.split(":")[1]);
		double TWOTotalSec1 = (TWOMin1 * MIN_TO_SEC) + TWOSec1;								//Split one time in Seconds 
		String TWOSplit1 = Double.toString(TWOSec1);										//TOTAL
		TWOSplit1 = formatter.format(TWOSec1);
		//End of Split No.1 for Runner No.2
				
				
		//Split No.2 For Runner No.2
		int TWOMin2 = Integer.parseInt(TWOtime2.split(":")[0]);
		double TWOSec2 = Double.parseDouble(TWOtime2.split(":")[1]);
		double TWOTotalSec2 = (TWOMin2 * MIN_TO_SEC) + TWOSec2;								//Split two time in seconds 
		int TWOSplit2Min = (int)(TWOTotalSec2 - TWOTotalSec1) / MIN_TO_SEC;					//Mile 2's minutes 
		double TWOSplit2Sec = (TWOTotalSec2 - TWOTotalSec1) % MIN_TO_SEC;					//Mile 2's seconds
		String TWOSplit2T = Double.toString(TWOSplit2Sec);
		TWOSplit2T = formatter.format(TWOSplit2Sec);
		//End of Split No.2 For Runner No.2
				
		//Split No.3 for Runner No.1
		int TWOMin3 = Integer.parseInt(TWOtimefinal.split(":")[0]);
		double TWOSec3 = Double.parseDouble(TWOtimefinal.split(":")[1]);
		double TWOTotalSec3 = (TWOMin3 * MIN_TO_SEC) + TWOSec3;								//Split three time in seconds
		int TWOSplit3Min = (int)(TWOTotalSec3 - TWOTotalSec2) / MIN_TO_SEC;					//Mile 3's minutes
		double TWOSplit3Sec = (TWOTotalSec3 - TWOTotalSec2) % MIN_TO_SEC;					//Mile 3's seconds
		String TWOSplit3T = Double.toString(TWOSplit3Sec);
		TWOSplit3T = formatter.format(TWOSplit3Sec);
		//End of Split No.3 for Runner No.2
				
		System.out.println();
		System.out.println();
		System.out.println("Runner one Summary: " + name2);
		System.out.println(divider);
		System.out.println("" + name2 + "'s Split 1 time: " + TWOMin1 + ":" + TWOSplit1);
		System.out.println("" + name2 + "'s Split 2 time: " + TWOSplit2Min + ":" + TWOSplit2T);
		System.out.println("" + name2 + "'s Split 3 time: " + TWOSplit3Min + ":" + TWOSplit3T);
		System.out.println();
		System.out.println();
				
		
				
		//*******************RUNNER 3*******************
		System.out.print("Please enter your first and last name: ");
		String name3 = keyboard.nextLine();
		String Firstname3 = name3.split(" ")[0];
		String Lastname3 = name3.split(" ") [1];
				
		System.out.print(Firstname3 + ", please enter your first mile: (MM:SS.SSS)");
		String THREEtime1 = keyboard.nextLine();
				
		System.out.print(Firstname3 + ", please enter your second mile: (MM:SS.SSS)");
		String THREEtime2 = keyboard.nextLine ();
				
		System.out.print(Firstname3 + "Please print your time to complete 5KM: (MM:SS.SSS)");
		String THREEtimefinal = keyboard.nextLine ();
				
		//split No.1 for Runner N0.3
		int THREEMin1 = Integer.parseInt(THREEtime1.split(":")[0]);
		double THREESec1 = Double.parseDouble(THREEtime1.split(":")[1]);
		double THREETotalSec1 = (THREEMin1 * MIN_TO_SEC) + THREESec1;								//Split 1's time in Seconds 
		String THREESplit1 = Double.toString(THREESec1);										    //TOTAL
		THREESplit1 = formatter.format(THREESec1);
		//End of Split No.1 for Runner No.3
				
				
		//Split No.2 For Runner No.3
		int THREEMin2 = Integer.parseInt(THREEtime2.split(":")[0]);
		double THREESec2 = Double.parseDouble(THREEtime2.split(":")[1]);
		double THREETotalSec2 = (THREEMin2 * MIN_TO_SEC) + THREESec2;								//Split 2's time in seconds
		int THREESplit2Min = (int)(THREETotalSec2 - THREETotalSec1) / MIN_TO_SEC;					//Mile 2's minutes
		double THREESplit2Sec = (THREETotalSec2 - THREETotalSec1) % MIN_TO_SEC;						//Mile 2's seconds
		String THREESplit2T = Double.toString(THREESplit2Sec);
		THREESplit2T = formatter.format(THREESplit2Sec);
		//End of Split No.2 For Runner No.3
				
		//Split No.3 for Runner No.3
		int THREEMin3 = Integer.parseInt(THREEtimefinal.split(":")[0]);
		double THREESec3 = Double.parseDouble(THREEtimefinal.split(":")[1]);
		double THREETotalSec3 = (THREEMin3 * MIN_TO_SEC) + THREESec3;								//Split 3's time in seconds
		int THREESplit3Min = (int)(THREETotalSec3 - THREETotalSec2) / MIN_TO_SEC;					//Mile 3's minutes
		double THREESplit3Sec = (THREETotalSec3 - THREETotalSec2) % MIN_TO_SEC;						//Mile 3's seconds
		String THREESplit3T = Double.toString(THREESplit3Sec);	
		THREESplit3T = formatter.format(THREESplit3Sec);
		//End of Split No.3 for Runner No.3
				
		System.out.println();
		System.out.println();
		System.out.println("Runner one Summary: " + name3);
		System.out.println(divider);
		System.out.println("" + name3 + "'s Split 1 time: " + THREEMin1 + ":" + THREESplit1);
		System.out.println("" + name3 + "'s Split 2 time: " + THREESplit2Min + ":" + THREESplit2T);
		System.out.println("" + name3 + "'s Split 3 time: " + THREESplit3Min + ":" + THREESplit3T);
		System.out.println();
		System.out.println();
		//End of Runner 3
				
				
				
				
				
		//************RUNNER 4****************
		System.out.print("Please enter your first and last name: ");
		String name4 = keyboard.nextLine();
		String Firstname4 = name4.split(" ")[0];
		String Lastname4 = name4.split(" ") [1];
				
		System.out.print(Firstname4 + ", please enter your first mile: (MM:SS.SSS)");
		String FOURtime1 = keyboard.nextLine();
				
		System.out.print(Firstname4 + ", please enter your second mile: (MM:SS.SSS)");
		String FOURtime2 = keyboard.nextLine ();
				
		System.out.print(Firstname4 +"Please print your time to complete 5KM: (MM:SS.SSS)");
		String FOURtimefinal = keyboard.nextLine ();
				
		//split No.1 for Runner N0.4
		int FOURMin1 = Integer.parseInt(FOURtime1.split(":")[0]);
		double FOURSec1 = Double.parseDouble(FOURtime1.split(":")[1]);
		double FOURTotalSec1 = (FOURMin1 * MIN_TO_SEC) + FOURSec1;								//Split 1's time in Seconds 
		String FOURSplit1 = Double.toString(FOURSec1);													//"T" = total
		FOURSplit1 = formatter.format(FOURSec1);
		//End of Split No.1 for Runner No.4
				
				
		//Split No.2 For Runner No.4
		int FOURMin2 = Integer.parseInt(FOURtime2.split(":")[0]);
		double FOURSec2 = Double.parseDouble(FOURtime2.split(":")[1]);
		double FOURTotalSec2 = (FOURMin2 * MIN_TO_SEC) + FOURSec2;								//Split 2's time in seconds
		int FOURSplit2Min = (int)(FOURTotalSec2 - FOURTotalSec1) / MIN_TO_SEC;					//Mile 2's minutes
		double FOURSplit2Sec = (FOURTotalSec2 - FOURTotalSec1) % MIN_TO_SEC;					//Mile 2's seconds
		String FOURSplit2T = Double.toString(FOURSplit2Sec);
		FOURSplit2T = formatter.format(FOURSplit2Sec);
		//End of Split No.2 For Runner No.4
				
		//Split No.3 for Runner No.4
		int FOURMin3 = Integer.parseInt(FOURtimefinal.split(":")[0]);
		double FOURSec3 = Double.parseDouble(FOURtimefinal.split(":")[1]);
		double FOURTotalSec3 = (FOURMin3 * MIN_TO_SEC) + FOURSec3;								//Split 3's time in seconds
		int FOURSplit3Min = (int)(FOURTotalSec3 - FOURTotalSec2) / MIN_TO_SEC;					//Mile 3's minutes
		double FOURSplit3Sec = (FOURTotalSec3 - FOURTotalSec2) % MIN_TO_SEC;					//Mile 3's seconds
		String FOURSplit3T = Double.toString(FOURSplit3Sec);
		FOURSplit3T = formatter.format(FOURSplit3Sec);
		//End of Split No.3 for Runner No.4
				
		System.out.println();
		System.out.println();
		System.out.println("Runner one Summary: " + name4);
		System.out.println(divider);
		System.out.println("" + name4 + "'s Split 1 time: " + FOURMin1 + ":" + FOURSplit1);
		System.out.println("" + name4 + "'s Split 2 time: " + FOURSplit2Min + ":" + FOURSplit2T);
		System.out.println("" + name4 + "'s Split 3 time: " + FOURSplit3Min + ":" + FOURSplit3T);
		System.out.println();
		System.out.println();
		//END OF RUNNER 4
				
		//*************RUNNER 5******************
		System.out.print("Please enter your first and last name: ");
		String name5 = keyboard.nextLine();
		String Firstname5 = name5.split(" ")[0];
		String Lastname5 = name5.split(" ") [1];
				
		System.out.print(Firstname5 + ", please enter your first mile: (MM:SS.SSS)");
		String FIVEtime1 = keyboard.nextLine();
				
		System.out.print(Firstname5 + ", please enter your second mile: (MM:SS.SSS)");
		String FIVEtime2 = keyboard.nextLine ();
				
		System.out.print(Firstname5 + "Please print your time to complete 5KM: (MM:SS.SSS)");
		String FIVEtimefinal = keyboard.nextLine ();
				
		//split No.1 for Runner N0.5
		int FIVEMin1 = Integer.parseInt(FIVEtime1.split(":")[0]);
		double FIVESec1 = Double.parseDouble(FIVEtime1.split(":")[1]);
		double FIVETotalSec1 = (FIVEMin1 * MIN_TO_SEC) + FIVESec1;								//Split 1's time in Seconds 
		String FIVESplit1 = Double.toString(FIVESec1);													//"T" = total
		FIVESplit1 = formatter.format(FIVESec1);
		//End of Split No.1 for Runner No.5
				
				
		//Split No.2 For Runner No.5
		int FIVEMin2 = Integer.parseInt(FIVEtime2.split(":")[0]);
		double FIVESec2 = Double.parseDouble(FIVEtime2.split(":")[1]);
		double FIVETotalSec2 = (FIVEMin2 * MIN_TO_SEC) + FIVESec2;								//Split 2's time in seconds
		int FIVESplit2Min = (int)(FIVETotalSec2 - FIVETotalSec1) / MIN_TO_SEC;					//Mile 2's minutes
		double FIVESplit2Sec = (FIVETotalSec2 - FIVETotalSec1) % MIN_TO_SEC;					//Mile 2's seconds
		String FIVESplit2T = Double.toString(FIVESplit2Sec);
		FIVESplit2T = formatter.format(FIVESplit2Sec);
		//End of Split No.2 For Runner No.5
				
		//Split No.3 for Runner No.5
		int FIVEMin3 = Integer.parseInt(FIVEtimefinal.split(":")[0]);
	    double FIVESec3 = Double.parseDouble(FIVEtimefinal.split(":")[1]);
		double FIVETotalSec3 = (FIVEMin3 * MIN_TO_SEC) + FIVESec3;								//Split 3's time in seconds
		int FIVESplit3Min = (int)(FIVETotalSec3 - FIVETotalSec2) / MIN_TO_SEC;					//Mile 3's minutes
		double FIVESplit3Sec = (FIVETotalSec3 - FIVETotalSec2) % MIN_TO_SEC;					//Mile 3's seconds
		String FIVESplit3T = Double.toString(FIVESplit3Sec);
		FIVESplit3T = formatter.format(FIVESplit3Sec);
		//End of Split No.3 for Runner No.5
				
		System.out.println();
		System.out.println();
		System.out.println("Runner one Summary: " + name5);
		System.out.println(divider);
		System.out.println("" + name5 + "'s Split 1 time: " + FIVEMin1 + ":" + FIVESplit1);
		System.out.println("" + name5 + "'s Split 2 time: " + FIVESplit2Min + ":" + FIVESplit2T);
		System.out.println("" + name5 + "'s Split 3 time: " + FIVESplit3Min + ":" + FIVESplit3T);
		System.out.println();
		System.out.println();
		//END OF RUNNER 5
				
				
		//*****TABLE*******
		String names = ("Runner");
		String a = ("Split 1 Time");
		String b = ("Split 2 Time");
		String c = ("Split 3 Time");
		String total = ("Time to Complete Race");
		System.out.println("");
		System.out.printf("%-15s %-16s %-16s %-16s %-25s %n", names, a, b, c, total);
		System.out.println(divider + divider + divider);
		System.out.printf("%-15s %-16s %-16s %-16s %-25s %n", name1, Min1      + ":" + Split1     , Split2Min      + ":" + Split2T     , Split3Min + ":" + Split3T, timefinal);
		System.out.printf("%-15s %-16s %-16s %-16s %-25s %n", name2, TWOMin1   + ":" + TWOSplit1  , TWOSplit2Min   + ":" + TWOSplit2T  , TWOSplit3Min + ":" + TWOSplit3T, TWOtimefinal);
		System.out.printf("%-15s %-16s %-16s %-16s %-25s %n", name3, THREEMin1 + ":" + THREESplit1, THREESplit2Min + ":" + THREESplit2T, THREESplit3Min + ":" + THREESplit3T, THREEtimefinal);
		System.out.printf("%-15s %-16s %-16s %-16s %-25s %n", name4, FOURMin1  + ":" + FOURSplit1 , FOURSplit2Min  + ":" + FOURSplit2T , FOURSplit3Min + ":" + FOURSplit3T, FOURtimefinal);
		System.out.printf("%-15s %-16s %-16s %-16s %-25s %n", name5, FIVEMin1  + ":" + FIVESplit1 , FIVESplit2Min  + ":" + FIVESplit2T , FIVESplit3Min + ":" + FIVESplit3T, FIVEtimefinal);
		//END OF TABLE
				
				
				

	}

}
