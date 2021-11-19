package Exceptions;
import java.util.*;

public class Exception {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter first number");

			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			System.out.println("Enter second number");
			int num2 = sc.nextInt();
			int c = num1 / num2 ;
			System.out.println("Division of two number is: "+c);
			
		}
		catch(ArithmeticException e )
		{
			System.out.println("Number cannot be divided by zero");
		}

	}

}
