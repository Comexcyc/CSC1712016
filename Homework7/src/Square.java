/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class Square extends Rectangle{

	public Square(double sides){
		super(sides,sides);
		
	}




@Override 
	public void setWidth(double width){
		super.setWidth(width);
		super.setHeight(width);
	}
	@Override
	public void setHeight(double height)
	{super.setHeight(height);
	super.setHeight(height);
	}


public String toString(){
	return "Square information "+ "side length "+this.width+"area "+getArea()+"filled？"+filled;
}

}
