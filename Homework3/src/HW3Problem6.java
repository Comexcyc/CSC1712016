/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:3
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/



import java.util.Scanner;

public class HW3Problem6 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a word");
		s=new Scanner(System.in);
		String a=s.next();
		String b="stop";
		while(!a.equals(b))
		{System.out.println("keep entering");
		String c=s.next();
		if (c.equals(b))
		  break;
		System.out.println(a+" "+c);
	    a=a+" "+c;
		}}}
		


