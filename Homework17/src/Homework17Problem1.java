/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:17
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework17Problem1<T> {
    protected Object[] value;
    protected int nextIndex;
		public Homework17Problem1(){
			value=new Object[0];
			nextIndex=0;
			
		}
		public void append(T x) {
			if (nextIndex >= value.length) {
				growArray();
			}
			value[nextIndex] = x;
			nextIndex += 1;
		
		
	}
		public void prepend(T x) {
			int oldlen=this.value.length;
			int newlen=oldlen+1;
			Object[] newvalue=new Object[newlen];
			for(int i=0;i<oldlen;i++){
				newvalue[i+1]=this.value[i];
				
			}
		newvalue[0]=x;
		this.value=(Object[])newvalue;
		
	}
		
		
		protected void growArray() {
		int oldlen = this.value.length;
		int newlen = oldlen + 1;
		System.out.println("ArrayList.growArray: oldlen=" + oldlen + ", newlen=" + newlen);
		Object[] newvalue = new Object[newlen];
		for (int i=0; i < oldlen; i++) {
			newvalue[i] = this.value[i];
		}
		this.value = newvalue;
	}
public  String toString(){
	String number=" ";
	System.out.println("The Array Includes");
	for(int i=0;i<value.length;i++){
		System.out.println(value[i]);
	}
	return number;
}
public static void main(String[] args) {
	Homework17Problem1<Integer> list = new Homework17Problem1<Integer>();
	
	list.append(new Integer(23));
	list.append(new Integer(1211));
	list.append(new Integer(121));
	list.prepend(new Integer(5));
	list.toString();
	
	Homework17Problem1<String> Secondlist = new Homework17Problem1<String>();
	Secondlist.append(new String("haha"));
	Secondlist.append(new String("how are you"));
	Secondlist.append(new String("Hey"));
	Secondlist.prepend(new String("bye"));
	Secondlist.toString();
}


	
	
	
	
	
}