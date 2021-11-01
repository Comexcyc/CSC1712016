/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:6
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.Scanner;

public class HW6Problem4 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter two strings");
		s=new Scanner(System.in);
		String B=s.nextLine();
String C=s.nextLine();
if(B.equalsIgnoreCase(C)){
	System.out.println("equal");
}else if(B.endsWith(C)){
	System.out.println("First string end with the second string");}
else if(B.startsWith(C)){System.out.println("First string start with the second string");
}else if(B.contains(C)){System.out.println("The First string contains the second string");
	}else{System.out.println("does not contain, start with, end with, or equal");}

}}
