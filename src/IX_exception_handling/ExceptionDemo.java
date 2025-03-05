package IX_exception_handling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("program started...");
		Scanner sc=new Scanner(System.in);
		
		//ex1
		/*System.out.print("enter a number: ");
		int num=sc.nextInt();
		System.out.println(100/num); //ArithmeticException
		
		//ex2
		int a[]=new int[5];
		System.out.print("enter position(0-4): "); 
		int pos=sc.nextInt();
		
		System.out.print("enter value: ");
		int val=sc.nextInt();
		a[pos]=val; //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);
		
		
		
		//ex3
		String str="test"; 
		int num = Integer.parseInt(str); //NumberFormatException
		System.out.println(num);
		
		//ex4
		String str1=null; 
		System.out.println(str1.length()); //NullPointerException*/
		
		System.out.println("program is completed");
		System.out.println("program exited");
	}

}
