package IX_exception_handling;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		System.out.println("program started...");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int num=sc.nextInt();
		
		try {
			System.out.println(100/num);
		} catch (ArithmeticException e) {
			System.out.println("invalid data");
		}
		
		System.out.println("program is completed");
		System.out.println("program exited");
	}

}
