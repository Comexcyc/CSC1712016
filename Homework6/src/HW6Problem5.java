/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:6
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.Scanner;

public class HW6Problem5 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


System.out.println("Please enter an integer and a double value");
s=new Scanner(System.in);
int a=s.nextInt();
Double h=s.nextDouble();
System.out.printf("%d %f %n",a,h);
System.out.printf("%1.3f %n",Math.PI);
System.out.println("Please enter a double value again");
Double d=s.nextDouble();

System.out.printf("%,f%n %n",d);
	}


}