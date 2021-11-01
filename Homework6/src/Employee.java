/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:6
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.Scanner;

public class Employee {
private String firstname;
private String lastname;
private int idnumber;
private int salary;
private Scanner s;
public void setfirstname(String firstname){
	this.firstname=firstname;
}
public String getfirstname(){
	return firstname;
}

public void setlastname(String lastname){
	this.lastname=lastname;
}
public String getlastname(){
	return lastname;
}
public void setIdnumber(int idnumber){
	this.idnumber=idnumber;
}

public int getIdnumber()
{ return idnumber;
}
public void setSalary(int salary){
	this.salary=salary;
}

public int getSalary()
{ return salary;
}

public Employee(String firstname,String lastname,int idnumber,int salary){
	this.firstname=firstname;
	this.lastname=lastname;
	this.idnumber=idnumber;
	this.salary=salary;
}
public Employee(String firstname, String lastname,String f,String g)
{
f="12345";
g="54321";
this.firstname=firstname;
this.lastname=lastname;

}

public void incrementdecrement()
{System.out.println("Please enter the number to change the salary, positive or negative ");
s=new Scanner(System.in);
int k=s.nextInt();
salary=salary+k;}

public String toString(){
	return "Employee:"+this.firstname+" ,"+this.lastname+","+this.salary+","+this.idnumber;
}

}
