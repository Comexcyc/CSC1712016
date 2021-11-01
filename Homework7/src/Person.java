/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

public class Person {
 int age;
 int phonenumber;
 String name;
	public Person(String name,int age,int phonenumber)
{this.name=name;
this.age=age;
this.phonenumber=phonenumber;
}
	public double getage() {
		return age;
	}
	public double getphonenumber() {
		return phonenumber;
	}public String toString() {
		
		return "Person[" + age + phonenumber+"]";

}
	public void Greeting(){
System.out.println("Hey, how are you?");
}}
