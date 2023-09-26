package Conditional_statement_prgm.java;

import java.util.Scanner;

public class switch_case {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Boolean z=true;
		while(z)	
		{
			System.out.println("press 1 to find Area of circle");
			System.out.println("press 2 to find Area of rectangle");
			System.out.println("press 3 to find Area of triangle");
			System.out.println("press 4 to find Area of square");
			System.out.println("press 5 to find Perimeter of circle");
			System.out.println("press 6 to find Perimeter of rectangle");
			System.out.println("press 7 to find Perimeter of triangle");
			System.out.println("press 8 to find Perimeter of Square");
			System.out.println("press 9 to Exit");
			System.out.println("--------------------------------------------------------------------");
		
		int ch;
		System.out.println("enter the choice between 1 to 9");
		ch=sc.nextInt();
		switch(ch)
		{
		
		case 1: System.out.println("area of circle");
		
		double pi=3.14,area;
		int r=2;
		area=3.14*r*r;
		System.out.println("Area of circle:" + area);
		System.out.println("--------------------------------------------------------------------");
		break;
		
		
		case 2: System.out.println("area of rectangle");
		
		int l=10,b=10;
		area=l*b;
		System.out.println("area of rectangle"+ area);
		System.out.println("--------------------------------------------------------------------");
		break;
		
		case 3: System.out.println("area of triangle");
		
		int B=20,H=20;
		area=0.5*B*H;
		System.out.println("area of Triangle"+ area);	
		System.out.println("--------------------------------------------------------------------");
		break;
		
		case 4:System.out.println("area of square");
			
		int s=10;
		area=s*s;
		System.out.println("area of square"+ area);
		break;
		
		case 5:System.out.println("perimeter of circle");
	    pi=3.14;
	    r=2;
	    double perimeter=2*3.14*r;
	    System.out.println("perimeter of circle"+ perimeter);
	    System.out.println("--------------------------------------------------------------------");
	    break;
	    
		case 6:System.out.println("perimeter of rectangle");
		int w=20;
		l=10;
	    perimeter=(2*(l+w));
	    System.out.println("perimeter of rectangle"+ perimeter);
	    System.out.println("--------------------------------------------------------------------");
		break;
		
		case 7:System.out.println("perimeter of Triangle");
		int a=10;
		b=20;
		int c=15;
		perimeter = a+b+c;
		
		System.out.println("perimeter of triangle" + perimeter);
		break;
		
		case 8:System.out.println("perimeter of Square");
		a=10;
		perimeter = 4*a;
		
		System.out.println("perimeter of square" + perimeter);
		System.out.println("--------------------------------------------------------------------");
		break;
		
		case 9:	
			z=false;
			break;
			
		default: 
			System.out.println("you entered wrong choice!!!!!...go fo another choice");
		}
		}

}}
