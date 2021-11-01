/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:3
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/



import java.util.Scanner;

public class HW3Problem2 {

	private static Scanner s;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		s=new Scanner(System.in);
		int a=s.nextInt();
		int z=1;
		for (;z<=10;z++){System.out.println(a*z);}
				
	}

}
