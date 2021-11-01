/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class StudentPersontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student alla=new Student("god",56,5763456,7878,"Computer Science","UR");
System.out.println(alla.age+"   "+alla.Major+"  "+alla.name+"  ID number:  "+alla.StudentID+" Phonenumber: "+alla.phonenumber+"  "+alla.Schoolname);
	alla.Greeting();
	Student allb=new Student("Grace",56,5763456,7878,"Education","U of R");
	allb.Greeting();
	
	
	}

}
