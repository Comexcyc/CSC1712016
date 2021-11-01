/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:2
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
import java.util.Scanner;

public class HW2Problem2 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.out.println("Please enter a number");
		s = new Scanner(System.in);
		int a=s.nextInt();
		if (a%5==0)
		{System.out.println("the number is a multiple of 5");
		}else{ System.out.println("the number is not a multiple of 5");}
		}
	}


