/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:6
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

import java.util.Random;
public class HW6Problem3 {

	private static Object rand;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random sd=new Random();
System.out.println(sd.nextInt(100));
	
Random ww=new Random();
	System.out.println(ww.nextDouble());
	double mu=ww.nextInt();
	double sigma=ww.nextInt();
	double rand=ww.nextGaussian()*sigma+mu;
	System.out.println(mu);
	System.out.println(sigma);
	System.out.println(rand);
	}

}
