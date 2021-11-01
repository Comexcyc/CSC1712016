/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:16
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

import java.util.Scanner;

public class Homework16Problem1test {

	private static Scanner userinput;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
userinput=new Scanner(System.in);
System.out.println("Please two numbers x and y");
int x=userinput.nextInt();
int y=userinput.nextInt();
	Homework16problem1.xy(x,y);
	System.out.println("The product is "+Homework16problem1.xy(x,y));
	}

}
