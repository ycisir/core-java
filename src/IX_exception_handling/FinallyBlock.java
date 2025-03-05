package IX_exception_handling;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("program started");
		Scanner sc=new Scanner(System.in);
		try {
			//connection start
			//System.out.println(string.length());
			//System.out.println(10/0);
			
			int a[]=new int[5];
			System.out.print("enter position(0-4): "); 
			int pos=sc.nextInt();
			
			System.out.print("enter value: ");
			int val=sc.nextInt();
			a[pos]=val; //ArrayIndexOutOfBoundsException
			System.out.println(a[pos]);
		
		} catch (Exception e) {
			System.out.println("exception handled");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("you are in finally block");
		}
		//connection close
		System.out.println("program exited");
	}

}
