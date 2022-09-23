package Daily_Assignment;

import java.util.Scanner;

public class LabAssgn 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);            
		System.out.println("Enter a Number");          
		int num = sc.nextInt();                        
		int rev= 0, a ,temp = num;						
														 
		
		while(num>0)									
		{
			a = num % 10;
			rev =(rev*10)+a;
			num = num/10;
		}
		if(temp==rev)								
		{
			System.out.println("No. is Palindrome ");
		}
		else
		{
			System.out.println("No. is not Palindrome ");
		}
			
	}

}