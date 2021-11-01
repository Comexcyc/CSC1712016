/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:14
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Homework14problem3 {
	private static Scanner s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		System.out.println("Please enter some strings");
		s=new Scanner(System.in);
		List<String> String2=new ArrayList<String>();
		for(int i=0;i<=5;i++){
			String a=s.nextLine();
			String2.add(a);}
		System.out.println("Please enter a string");
		String b=s.nextLine();
		for (String x:String2){
			if(b.equals(x)){System.out.println("the list contain the final String and the index is "+String2.indexOf(x));
			}
			else{count=count+1;
			if (count==6){System.out.println("The list does not contain the final String");
			}
		}}

	}

}
