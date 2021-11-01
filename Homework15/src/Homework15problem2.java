/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:15
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework15problem2 {
	Scanner input = new Scanner(System.in);
	
	protected int readInt() {
		System.out.print("Enter a number: ");
		return input.nextInt();
	}
	
	protected String readString(){
		System.out.print("Enter a string: ");
		return input.next();
	}
	
	protected void run() {


			
		try{
			int n1 = readInt();
			String a = readString();
			int n2 = readInt();
		    if(a.equals ("+")){
			int sum = n1 + n2;
			System.out.println(sum);
		}
		if(a.equals("-")){
			int difference = n1 - n2;
			System.out.println(difference);
		}
		else if(a.equals("*")){
			int product = n1 * n2;
			System.out.println(product);
		}
		else if(a.equals("/")){
			int quotient = n1 / n2;
			System.out.print(quotient);
		}
		else if(a.equals("%")){
			int remainder = n1 % n2;
			System.out.println(remainder);
		}
		else{
			System.out.println("Wrong string.");
		}
		}catch (ArithmeticException e) {
			System.out.println("arithmetic exception!");
		}catch (InputMismatchException e) {
			System.out.println("something wasn't a number!");
		}
	}
	
	public static void main(String []args){
		new Homework15problem2().run();
	}
	
	
			
	

}