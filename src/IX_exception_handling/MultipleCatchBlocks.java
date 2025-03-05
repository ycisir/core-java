package IX_exception_handling;

import java.lang.classfile.AnnotationValue.OfAnnotation;
import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("program started");
		//String string=null;
		Scanner sc=new Scanner(System.in);
		try {
			
			//System.out.println(string.length());
			//System.out.println(10/0);
			
			int a[]=new int[5];
			System.out.print("enter position(0-4): "); 
			int pos=sc.nextInt();
			
			System.out.print("enter value: ");
			int val=sc.nextInt();
			a[pos]=val; //ArrayIndexOutOfBoundsException
			System.out.println(a[pos]);
		
		}/* catch (ArithmeticException e) {
			
			System.out.println("exception handled");
			System.out.println(e.getMessage());
		
		} catch (NullPointerException e) {
			
			System.out.println("exception handled");
			System.out.println(e.getMessage());
			
		} catch (NumberFormatException e) {
			
			System.out.println("exception handled");
			System.out.println(e.getMessage());
			
		}*/ catch (Exception e) {
			//Exception is a superclass of all exceptions

			System.out.println("exception handled");
			System.out.println(e.getMessage());
		}
		
		System.out.println("program exited");
	}

}
