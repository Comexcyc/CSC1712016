/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:15
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.Scanner;
public class Homework15problem1 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter a strng");
s=new Scanner(System.in);
String a=s.next();
try{
	int y=Integer.parseInt(a);
			y++;
			System.out.println(y);
			
}catch(NumberFormatException e){
	System.out.println("That is not an integer");
}

	}

}
