/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:9
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/ 
public class TriangleTable {
	public int rows;
	public TriangleTable(int rows){
		this.rows=rows;
	}
	public void printout(){
		for(int i=0;i<=rows;i++){
		for(int n=i;n>=0;n-- ){
	 System.out.print(n);}
		System.out.println();
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleTable q=new TriangleTable(1);
		q.printout();
TriangleTable b=new TriangleTable(6);
b.printout();
TriangleTable t=new TriangleTable(2);
t.printout();
TriangleTable z=new TriangleTable(3);
z.printout();	
TriangleTable v=new TriangleTable(4);
v.printout();	
TriangleTable p=new TriangleTable(5);
p.printout();	
TriangleTable m=new TriangleTable(7);
m.printout();	
TriangleTable n=new TriangleTable(8);
n.printout();	
TriangleTable x=new TriangleTable(9);
x.printout();
TriangleTable u=new TriangleTable(10);
u.printout();
	}

}
