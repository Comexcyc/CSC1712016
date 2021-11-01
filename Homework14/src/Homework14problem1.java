/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:14
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Homework14problem1 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter some Integers");
		s=new Scanner(System.in);
		
		int a=s.nextInt();
		
		List<Integer> integers=new ArrayList<Integer>();
		while(a!=0){
			integers.add(a);
			int c=s.nextInt();
		a=c;


}
		while(a==0){
        	integers.add(a);
        	System.out.println("Please enter a number");
        	int b=s.nextInt();
        	for (int i=0; i<integers.size();i++ ){
        	if (b==integers.get(i)){
        		System.out.println("This number is in the List");}
        	else{System.out.println(" ");
        	}
        	}
        }


	}

}
