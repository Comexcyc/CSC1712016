/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:1
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
 



import java.util.Scanner;

public class problem4 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the temperature" );
		int z= s.nextInt();
		System.out.println(((z-32)*5)/9+273);
		System.out.println(z+"degrees Fahrenheit is"+ (((z-32)*5)/9+273)+"Kelvin");
	}

}
