/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:1
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
 


import java.util.Scanner;

public class problem3 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        Double b= s.nextDouble();
        //System.out.println(b);	
        System.out.println("Please enter another decimal number: ");
        double c= s.nextDouble();
        System.out.println(b+c);
        System.out.println(b-c);
        System.out.println(b/c);
        System.out.println(b*c);
	}

}
