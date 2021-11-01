/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:17
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/
public class Homework17problem5to9<T> {
protected static Node current=null;
static Exception a;
protected static Node first=null;

protected static class Node{
	public Object data;
	public Node next;
	public Node(Object data){
		this.data=data;
		
	}
	public Node last;
	
}
//Question 5
public void prepend(T a){
	Node newnode=new Node(a);
	newnode.next=first;
	first=newnode;
}
//Question 6
public int indexOf(T a){
	int length=0;
	current=first;
	while(current!=null){
		length++;
		current=current.next;
		
	}
current=first;
for(int i=0;i<length;i++){
	if(current.data.equals(a)){
		return i+1;
	}
	current=current.next;
	
}return-1;
}
//question7
public static Object get(int i) throws IndexOutOfBoundsException{
	IndexOutOfBoundsException a=new IndexOutOfBoundsException();
	int length=0;
	current=first;
	while(current!=null){
		length++;
		current=current.next;}
	
if(i>length+1){
	throw a;
}
current=first;
for(int n=0;n<i-1;n++){
	current=current.next;
}
return current.data;
	
}
//08
public void append(T x){
	Node last=new Node(x);
	if(first==null){
		first=last;
		current=first;
		
	}else{current.next=last;
	current=current.next;
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework17problem5to9<Integer> list=new<Integer>Homework17problem5to9();
		list.append(new Integer(1));
		list.append(new Integer(2));
		list.append(new Integer(3));
		list.prepend(new Integer (5));
		//System.out.println(list.indexOf(5));
		try{
			System.out.println(get(1));
			System.out.println(get(10));
			
		}catch(IndexOutOfBoundsException a){
			System.out.println("Does not exist");
		}
	}

}
