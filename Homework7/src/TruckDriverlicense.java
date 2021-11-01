/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class TruckDriverlicense extends DriversLicenses{
	
	public TruckDriverlicense(int Licensenumber,int day,int month,int year,String issuedState)
	{super(Licensenumber,day,month,year,issuedState);}
	@Override
public String toString(){
	return "This is a Truck Driver Licence"+"Licensenumber"+Licensenumber+"issuedday"+day+"   "+"issuedmonth "+month+"   "+"issuedyear "+year+"issuedState"+issuedState;
}
}
