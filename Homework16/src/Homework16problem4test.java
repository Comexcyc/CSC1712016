/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:16
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

import java.util.Scanner;

public class Homework16problem4test {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
s=new Scanner(System.in);

System.out.println("Please enter a number to calculate the Fabonicci sequence");
int a=s.nextInt();
Homework16problem4.fibonacci(a);
System.out.println("The result is "+Homework16problem4.fibonacci(a));
	}

}
