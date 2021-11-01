/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class DriversLicenses extends License {
String issuedState;
public DriversLicenses(int Licensenumber,int day,int month,int year,String issuedState){
super( Licensenumber, day, month, year);
this.issuedState=issuedState;}

public  boolean equals(DriversLicenses c )
{if(Licensenumber==c.Licensenumber&&day==c.day&&year==c.year&&month==c.month&&issuedState.equals(c.issuedState))
{return true;}else{return false;}}
public String toString(){
	return "Licensenumber"+Licensenumber+"issuedday"+day+"   "+"issuedmonth "+month+"   "+"issuedyear "+year+"issuedState"+issuedState;
}
}
