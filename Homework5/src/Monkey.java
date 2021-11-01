/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:5
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

public class Monkey {
String name;
	String color;
double weight;

public Monkey(String a,double b,String c){
color=a;
weight=b;
name=c;}
public void setName(String name)
{this.name=name;}
  public String getName(){
	 return name; 
  }public String toString() {
		
		return name + color + weight;
}}

