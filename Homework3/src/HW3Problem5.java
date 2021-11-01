/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:3
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.Scanner;

public class HW3Problem5 {

	
	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Please enter number");
		 s=new Scanner(System.in);
		int a=s.nextInt();
		while (a!=0){System.out.println("enter another number to keep calculating");
		int b=s.nextInt();
		if (b==0)
			break;
		System.out.println(a+b);
		
			a=a+b;	
			
		}
		
	}

}
