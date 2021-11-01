/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:16
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.Scanner;

public class Homework16problem2test {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	s=new Scanner(System.in);	
	System.out.println("Please enter a number");
	int x=s.nextInt();
	Homework16problem2.numericalPalindrome(x);
	System.out.println(Homework16problem2.numericalPalindrome(x));
	}

}
