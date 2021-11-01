/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:1
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
 
import java.util.Scanner;

public class Problem5 {
    public static Scanner s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         s= new Scanner(System.in);
         System.out.println("Please Eneter a number of grams" );
         int c;
         c= 299792458;
         Double b=s.nextDouble();
         System.out.println("The amount of energy is"+ (b*c*c)+"Joules");
	}

}
