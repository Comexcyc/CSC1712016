/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:5
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

public class Person {
 int age;
 int phonenumber;
 String name;
	public Person(String name,int n,int a)
{this.name=name;
age=n;
phonenumber=a;
}
	public double getage() {
		return age;
	}
	public double getphonenumber() {
		return phonenumber;
	}public String toString() {
		
		return "Person[" + age + phonenumber+"]";

}}