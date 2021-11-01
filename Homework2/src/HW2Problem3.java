/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:2
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
import java.util.Scanner;

public class HW2Problem3 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		s = new Scanner(System.in);
		int b=s.nextInt();
		if (b>0)
		{System.out.println("the number is positive");}
		else if(b<0)
		{System.out.println("the number is negative");}
		else if(b==0)
		{System.out.println("the number is zero");}	
			
		
	}

}
