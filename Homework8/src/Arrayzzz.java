
/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:8
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/import java.util.Scanner;

public class Arrayzzz {

	private static Scanner s;
	 public static void printArray(int[] a){
	    	for (int value : a) {
		        System.out.print(value);
		        System.out.print(" ");
			}
			System.out.println();
		}
	 //QUestion
	 public static void middleIndex(int[]n){
		 double middleIndex=n.length/2;//if the length is an even number, I divide it in half anf chose the bigger one, for example, if there are total 8 number, I will pick the fifth as middle
		 if(n.length%2!=0){System.out.println("Middle index"+Math.round(middleIndex-0.5)+"value at the middle index"+n[ (int) (middleIndex+0.5)]);}
		 else{System.out.println("Middle index"+(middleIndex+1)+"value at the middle index"+n[(int) (middleIndex+1)]);}}
	 public static void minimumvalue(int[]l){
		int k=l[0];
		 for(int j=0;j<l.length;j++){if(l[j]<k){k=l[j];}
		 
		 }System.out.println(k);
	 }
	//Question
	 public static void addintegertoarray(int[]q){
		 System.out.println("Please enter an integer");
	 int e=s.nextInt();
	 
	 for(int val:q){int r=val+e;
		 System.out.println(r);
	 System.out.println(" ");
		 
	 }
	 System.out.println("this is the array after adding");
	 }
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Please enter and integer");
s=new Scanner(System.in);
int a=s.nextInt();
int[] numbers=new int[a];
for(int i=0;i<a;i++)
{
System.out.println("Please more integers");
	int b=s.nextInt();
	numbers[i]=b;
	
	}
    for(int g=0;g<a;g++)
	{System.out.println(numbers[g]);
}
    printArray(numbers);
	middleIndex(numbers);
	minimumvalue(numbers);
	 addintegertoarray(numbers);
	
	 int[] copy=new int[a];
	 for(int i=0;i<a;i++){
		 copy[i]=numbers[i];
	 }
	 System.out.println("firstelement of the copy"+copy[0]);
	 System.out.println("firstelement of the copy"+copy[a-1]);
	
	 System.out.println("the original array plus copy array");
	 for(int i=0;i<a;i++)
	 {numbers[i]=numbers[i]+copy[i];
	 System.out.println(numbers[i]);}
   //System.out.println();
   System.out.println("The copy array didn't change");
	 for(int g=0;g<a;g++)
	//{System.out.println(numbers[g]);   
	//System.out.println("      ");
	{System.out.println(copy[g]);
	}
}}