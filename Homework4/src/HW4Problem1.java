/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:4
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.Scanner;

public class HW4Problem1 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter number");
s=new Scanner(System.in);
int a=s.nextInt();

do{ System.out.println(a*a);
 System.out.println("Please a new number");
 int c=s.nextInt();
  a=c;
  
  
 }while (a!=0);
	 
	}

}
