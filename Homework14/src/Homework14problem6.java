/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:14
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Homework14problem6 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter some name number pairs (seprated by white space)");
		Map<String,Integer> phonebook=new HashMap<String,Integer>();
		s=new Scanner(System.in);
		for(int i=0; i<=3;i++){
		String a=s.next();
		int b=s.nextInt();
		phonebook.put(a, b);
		}
		System.out.println("Please enter a name");
		String name=s.next();
		System.out.println(name+"'s number is "+phonebook.get(name));
		if (phonebook.get(name)==null){
			System.out.println("The person you want does not exist");
		}
	}

}
