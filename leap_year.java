package Conditional_statement_prgm.java;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
	int year;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
	year=sc.nextInt();
	if(year%4==0)
	{
		System.out.println("leap year");
	}
	else
	{
		System.out.println("not a leap year");
	}

	}

}
