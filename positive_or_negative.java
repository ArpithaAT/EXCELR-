package Conditional_statement_prgm.java;

import java.util.Scanner;

public class positive_or_negative {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("number is positive");
		}
		else
		{
			System.out.println("number is negative");
		}
	}

}
