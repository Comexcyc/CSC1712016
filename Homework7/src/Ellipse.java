/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class Ellipse extends Shape2D {
protected double majoraxis;
protected double minoraxis;

public Ellipse(double majoraxis,double minoraxis){
this.majoraxis=majoraxis;
this.minoraxis=minoraxis;

}

public double getMinoraxis(){
	return minoraxis;
}
public void setMnioraxis(double minoraxis){
	this.minoraxis=minoraxis;
}
public double getMajoraxis(){
	return majoraxis;
}
public void setMajoraxis(double majoraxis){
	this.majoraxis=majoraxis;
}
@Override
public double getArea()
{return Math.PI*this.minoraxis*this.majoraxis;}
}
