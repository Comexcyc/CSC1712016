/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class FishingLicense extends License {
	String typesoffish;
	public FishingLicense(int Licensenumber,int day,int month,int year,String typesoffish){
super(Licensenumber,day,month,year);
	this.typesoffish=typesoffish;
	
	}
	@Override
	public String toString(){
		return "Licensenumber"+Licensenumber+"issuedday"+day+"   "+"issuedmonth "+month+"   "+"issuedyear "+year+"typesoffish"+typesoffish;
	}
}
