/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:7
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class Testforshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle a=new Circle(5);
System.out.println(a.getArea());
Ellipse c=new Ellipse(6.7,8.9);
System.out.println(c.getArea());


Rectangle b=new Rectangle(5,6);
System.out.println(b.getArea());
	System.out.println(b.toString());

Square h=new Square(7);
	System.out.println(h.getArea());
	System.out.println(h.toString());
	}

}
