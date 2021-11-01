/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class Student extends Person {
 int StudentID;
 String Major;
 School Schoolname;
 //String School;
int studentage;
public Student(String name,int age,int phonenumber,int StudentID,String Major,String school)
{super(name,age,phonenumber);
this.StudentID=StudentID;
this.Major=Major;
this.Schoolname=new School(school);




}

@Override
public void Greeting(){
	if (Major.equals("Computer Science")){
		System.out.println("Greetings Earthling");
	}
	else{System.out.println("Hey");
}}}

