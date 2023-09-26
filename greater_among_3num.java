package Conditional_statement_prgm.java;

import java.util.Scanner;

public class greater_among_3num {

	public static void main(String[] args) {
//		int n1=56,n2=78;
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		
		if(n1>n2)
		{
			System.out.println("n1 is greater");
		}
		else if(n2>n3)
		{
			System.out.println("n2 is greater");
		}
		else 
		{
			System.out.println("n3 is greater");
	}
}}


