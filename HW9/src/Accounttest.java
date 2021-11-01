/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:9
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/ 
public class Accounttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account.Account a= new Account.Account("Comex","scscschuhu");
		 BankAccount.Account g=new BankAccount.Account(76854321,7867,"husfhiuhguhfisd");
	System.out.println("Network Account username: "+a.Username+" Network Account Password: "+a.Password);
	System.out.println("Bank Account Accountnumber"+g.Accountnumber+" pin: "+g.pin+" Bank Account Password: "+g.Password);
	}

}
