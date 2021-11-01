/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class Rectangle extends Shape2D {
protected double width;
protected double height;
public Rectangle(double width,double height){
this.width=width;
this.height=height;
}
public double getWidth()
{return width;

}
public void setWidth(double width){
	this.width=width;
}
public double getHeight()
{return height;}
public void setHeight(double height){
	this.height=height;
	
}
@Override 
public double getArea(){
	return this.width * this.height;
	
}
public String toString(){
	return "Rectangle information "+ "width length "+this.width+"height length"+this.height+"area "+getArea()+"filled？"+filled;
}
}