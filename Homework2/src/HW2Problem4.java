/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:2
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
import java.util.Scanner;

public class HW2Problem4 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your age");
		s = new Scanner(System.in);
		int a=s.nextInt();
		if (a<13)
		{System.out.println("You are just a kid");
		}else if(13<=a&&a<20){
			System.out.println("You are a teenager");
			}else if(a>=20&&a<30){
				System.out.println("You are getting older");
				}else if(a>=30){
					System.out.println("You are over the hill");}	
			
	}
}

	


