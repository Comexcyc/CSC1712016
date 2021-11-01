/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:14
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Homework14problem4 {
private static Scanner s;




public static boolean elemtents(List b,int a,int c){
	if((b.get(a)).equals(b.get(c))){System.out.println("the two elements are equal");return true;}
	else{System.out.println("the two elements are not equal");
	return false;
	}
	
}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		System.out.println("Please enter some strings");
		List<String> Stringa=new ArrayList<String>();
		for(int i=0;i<=5;i++){
		
		String a=s.nextLine();
		Stringa.add(a);}
		System.out.println("Please enter two int between 0 and 5 (included)");
		int int1=s.nextInt();
		int int2=s.nextInt();
		elemtents(Stringa,int1,int2);
	}

}
