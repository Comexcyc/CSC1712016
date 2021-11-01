/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:16
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.Scanner;

public class Homework16problem3 {
public static int LucasNumbers(int x){
	if(x==0){
		return 2;
		
	}else if(x==1){
		return 1;
	}else{return LucasNumbers(x-1)+LucasNumbers(x-2);
    
}
}
public static void main(String []args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter which Lucas number you want to compute");
	int x=scanner.nextInt();
	System.out.println("The result is"+ LucasNumbers(x));
}}