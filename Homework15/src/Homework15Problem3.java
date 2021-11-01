/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:15
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/



import java.util.Scanner;
import java.util.InputMismatchException;
public class Homework15Problem3 {
public static int getInteger(Scanner scanner){
	boolean rewrite=true;
	int a=0;
	do{
		try{
			System.out.println("Enter a number");
			a=scanner.nextInt();
			System.out.println("The number is"+a);
			rewrite=false;}
		catch(InputMismatchException e){
			System.out.println(" Sorry,This is not an Integer,Pleas enter again");
			scanner.nextLine();
		}
	}while(rewrite==true);
	return a;
}
public static void main(String[] args){
	Scanner scanner =new Scanner(System.in);
	getInteger(scanner);
}
}
