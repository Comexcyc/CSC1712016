/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
import java.time.LocalDate;
//import java.util.Date;


public class License {
public int Licensenumber;
//LocalDate Licensedate;
//Date publishdate;
int month;
int day;
int year;
int daycurrent;
int date;
LocalDate da=LocalDate.of(2016,10,5);
LocalDate Local=LocalDate.now();

//String issuedState;
//public Object issuedState;
public License(int Licensenumber,int day,int month,int year){
this.Licensenumber=Licensenumber;
	//this.Licensedate=Licensedate;
//publishdate=new Date(month,day,year);
//this.date=date;
this.day=day;
this.month=month;
this.year=year;
}
public  boolean equals(License b)
{if(Licensenumber==b.Licensenumber&&day==b.day&&year==b.year&&month==b.month)
{return true;}else{return false;}}
//public int getDayOfYear(){return daycurrent;}
public boolean expired(){
	{if(da.isBefore(Local)){
		System.out.println("not expired");return true;
		}else{System.out.println(" expired");return false;
	}

}
	
}public String toString(){
	return "Licensenumber"+Licensenumber+"issuedday"+day+"   "+"issuedmonth "+month+"   "+"issuedyear "+year;
}}

