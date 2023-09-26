package Conditional_statement_prgm.java;

import java.util.Scanner;

public class dividible_by_5 {

	public static void main(String[] args) {
	    
		int n;
	     Scanner sc= new Scanner(System.in);
	     System.out.println("enter the number");
	     n=sc.nextInt();
	     if(n%5==0)
	     {
	    	System.out.println("no is divisible by 5");
	     }
	     else
	     {
	    	 System.out.println("no is not divisible by 5");
	     }

}
	}
