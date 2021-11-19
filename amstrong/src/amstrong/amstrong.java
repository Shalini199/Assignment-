package amstrong;
import java.util.*;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp=num;
		int sum=0;
		int count=countDigit(num);
		while(num!=0)
		{
			int digit =num % 10;
			sum = sum + power (digit,count);
			num = num/10;
		}
	if(temp == sum)
	{
		System.out.println("Amstrong number");
		
	}
	else
	{
		System.out.println("Not a amstrong number");
		
	}
	}
	public static int countDigit(int num)
	{
		int count = 0;
		while(num!=0)
		{
			num = num/10;
			count++;
			
		}
		return count;
		
	}
	public static int power(int digit,int count)
	{
		int product = 1;
		for(int i =1;i<=count;i++)
		{
			product = product * digit;
			
		}
		return product;
	}
	

}
