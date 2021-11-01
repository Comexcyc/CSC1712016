/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:2
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
 
import java.util.Scanner;

public class HW2Problem1 {

	private static Scanner b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int secret =3;
    System.out.println("Please enter an integer");
    b = new Scanner(System.in);	
    int c=b.nextInt();
      if (c==secret) { 
    System.out.println("You are a winner");		
      }else{System.out.println("You lose");}
    
    
    		
    	
    }
  
	}


