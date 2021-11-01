/*
	 * Name:Yingcan Chen
	 *NetID: ychen192
	 *Assignment Number:2
	 *Lab Section:T/R 18:15-19:30
	 *I did not collaborate with anyone on this assignment*/

import java.util.Scanner;

public class HW2Problem5 {

	
	
	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 to discuss sports,2 to discuss food");
		s=new Scanner(System.in);
		int a=s.nextInt();
		if (a==1)
		{System.out.println("Do you play ice hockey? True/False");
	    s.hasNext();
	    if (s.hasNextBoolean()) {System.out.println("Awesome");}
	    else {System.out.println("You should try it");}}
		else if (a==2) {System.out.println("How many times you ate pizza last week");
		 int b=s.nextInt();
		 if (b>=5){System.out.println("You should eat better");}
		 else {System.out.println("OK");}}
		}
	

}
