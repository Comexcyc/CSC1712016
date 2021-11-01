/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
import java.time.LocalDate;

public class Licencetest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
License GH=new License(7878,10,9,2016);
	License AB=new License(7878,10,9,2016);
	
	if(AB.equals(GH)==true){System.out.println("True");}else{System.out.println("false");
	}
//if((AB).expired(GH)){System.out.println("true");
//}else if(GH.expired(AB)){System.out.println("true");
//}else{System.out.println("false");
	
//if((GH.publishdate).expired(AB.publishdate)){System.out.println("true");
//}else if(GH.expired(AB)){System.out.println("true");
//}else{System.out.println("false");
	//}*/
	DriversLicenses v=new DriversLicenses(7877,11,4,2016,"CA");
	DriversLicenses g=new DriversLicenses(7877,11,4,2016,"CA");
	if(v.equals(g)==true){System.out.println("True");}else{System.out.println("false");
	}
	AB.expired();
	v.toString();
	TruckDriverlicense jkjk=new TruckDriverlicense(7878,23,2,2017,"NY");
	jkjk.toString();
	FishingLicense ghgh=new FishingLicense(7878,23,3,2020,"Salmon");
	ghgh.toString();
	
	}}
	
	//}}
