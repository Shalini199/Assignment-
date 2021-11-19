package Exceptions;
import java.util.*;

public class UnSupportedExceptionHandling
{
	public static void main(String[] args) 
	{
		
		try {
		   Scanner  sc = new Scanner(System.in);
			System.out.println("Enter The First Number:");
			int a = sc.nextInt();
			System.out.println("Enter The Second Number:");
			int b = sc.nextInt();
			int c = (a/b);
			System.out.println("Division of Two Numbers: "+c);
			throw new UnsupportedOperationException("Number cannot be divided by zero");
		} catch (UnsupportedOperationException e) {
	       
	       
			
	    }
	
	}

}