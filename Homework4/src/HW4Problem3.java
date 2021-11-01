/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:4
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/





import java.util.Scanner;

public class HW4Problem3 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
   s=new Scanner(System.in);
   System.out.println("Please enter three numbers" );
   int a=s.nextInt();
   int b=s.nextInt();
   int c=s.nextInt();
      do{ 
    if(a<b&b<c){System.out.println(a+"<"+b+"<"+c);}
   else if(a>b&a<c){System.out.println(b+"<"+a+"<"+c);}
   else if(a>b&b>c){System.out.println(c+"<"+b+"<"+a);}
   else if(a<b&a<c){System.out.println(a+"<"+c+"<"+b);}
   else if(a<b&a>c){System.out.println(c+"<"+a+"<"+b);}
   else if(a>b&b<c){System.out.println(b+"<"+c+"<"+a);}
    System.out.println("Please enter three numbers");
    int d=s.nextInt();
    int e=s.nextInt();
    int f=s.nextInt();
    a=d;
    b=e;
    c=f;
    
    //if(d<e&e<f){System.out.println(d+"<"+e+"<"+f);}
    //else if(d>e&d<f){System.out.println(b+"<"+a+"<"+c);}
   // else if(d>e&e>f){System.out.println(f+"<"+e+"<"+d);}
    
    
    
    
   }while(a!=0&b!=0&c!=0);
	}}


