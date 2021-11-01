/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:6
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class Employeetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee z =new Employee("Rick","Obama",23232,12121);
	System.out.println(z.getfirstname()+" "+z.getlastname()+" "+z.getIdnumber()+" "+z.getSalary());
z.incrementdecrement();
	System.out.println(z.toString());
	}

}
