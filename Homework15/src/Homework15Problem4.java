/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:15
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
import java.util.ArrayList;
import java.util.List;
import java.util.IndexOutOfBoundsException;
public class Homework15Problem4 {
public static Object object(List<E> list,int index){
	try{
		return list.get(index-1);
		
	}catch(IndexOutOfBoundsException e){
		return null;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> i=new ArrayList<Integer>();
i.add(1);
i.add(3);
i.add(5);
i.add(7);
System.out.println(object(i,2));
System.out.println(object(i,5));
	}

}
