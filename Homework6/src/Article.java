/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:6
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/



import java.util.Date;
import java.util.Scanner;
public class Article {
  String authorname;
 private Date current=new Date();
 private String posted;
 private String text;
 private int likes=0;

 private Scanner s;

public void setPosted(String posted){
	this.posted=posted;
}
public String getPosted(){
	return posted;
}
 /*Date f=new Date();*/
 public void setCurrent(Date current){
	
	 this.current=current;
}
 public Date getCurrent(){
	 return current;
 }
 
public void setText(String text){
text="things you need to know about computer science";
	//this.text= text;
}

public String getText(){
return text = "things you need to know about computer science";}


public void setLikes(int likes){
	this.likes=likes;
}

public int getLikes()
{ return likes;
}
 public Article(String c )
 {authorname=c;
 
 }
 
 public Article(String e, String f){
	 authorname=e;
	 posted=f;
 }
public void like(){
	this.likes+=1;}
	
	
	/* System.out.println("Do you like the article");
s=new Scanner(System.in);
String a=s.nextLine();
if (a=="like"){likes=likes+1;*/

 
public void unlike(){
	this.likes-=1;
}
public String toString(){
	return "Article:"+this.authorname+" ,"+this.posted+","+this.current+","+this.getText()+","+this.likes;
}
}

