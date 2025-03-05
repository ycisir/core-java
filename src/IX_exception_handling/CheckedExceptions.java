package IX_exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("programm start");
		
		System.out.println("performing calculation...");
		Thread.sleep(5000);
		FileInputStream file=new FileInputStream("/home/user/Documents/test.txt");

		
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

		}*/
		System.out.println("passed");
		
		
		System.out.println("program exited");
	}

}
