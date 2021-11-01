/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:4
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/





import java.util.Scanner;

public class HW4Problem4 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter a number n");
s=new Scanner(System.in);
double n=s.nextDouble();
double a=0.0;
for (double i=1;i<=n;i++){
	if(i%2==0&i!=1)
   { a=a+1/i-1/(i-1);
	}
	else if(i%2!=0){a=a+1/i;
	}

}System.out.println(a);}}
