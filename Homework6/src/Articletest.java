/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:6
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

import java.util.Scanner;

public class Articletest {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Article a=new Article("King","2009/11/24");
				System.out.println("Author "+a.authorname+a.getCurrent());
	
	           System.out.println("Author and posted date"+a.authorname+a.getPosted());
	s=new Scanner(System.in);
	          System.out.println("do you like the article");
	          String g=s.nextLine();
	if(g.equals("yes"))
	          
	          
	          
	{ a.like();}
	else {a.unlike();}
	System.out.println(a.toString());
	}
	

}
