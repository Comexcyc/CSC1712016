/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:14
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework14problem5 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter some string of names");
		s=new Scanner(System.in);
		int count=0;
	List<String> Stringa=new ArrayList<String>();
	for(int i=0;i<=10;i++){
		String a=s.nextLine();
		
		Stringa.add(a);
	}
	
	for(int x=0;x<Stringa.size();x++){
		for (int y=x+1;y<Stringa.size();y++){
			if((Stringa.get(x)).equals(Stringa.get(y))){
				Stringa.remove(y);
				//y=y+1;
			}else{System.out.print(" ");
		}
	}
	}for(String x: Stringa){
		System.out.println(x);
	}
	System.out.println("Please enter a name");
	String b=s.nextLine();
	for (String x:Stringa){
		
		if(b.equals(x)){System.out.println("the list contain this name" );
		}
		else{count=count+1;
		if (count==Stringa.size()){System.out.println("The list does not contain the name");
		}
	}}}}
	
	
	
	
	
	/*for(int i=0;i<=10;i++){
for (String x:Stringa){if(a.equals(x)){
	System.out.println(a+" is not added because of duplication");}
else{System.out.println(a+" is added to the list");
	Stringa.add(a);}*/

			
		
	
		
	


