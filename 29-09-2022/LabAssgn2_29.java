package Daily_Assignment;

//Write a program to calculate HCF of Two given number.
	
import java.util.Scanner;

public class LabAssgn2_29 
{


public static void main(String arg[]) 
{
	LabAssgn2_29 obj = new LabAssgn2_29();
	obj.HCF();
}

public void HCF() 
{
	int num1, num2, i, HCF = 0;          
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number : ");  
	num1 = sc.nextInt();
	
	System.out.println("Enter second number : "); 
	num2 = sc.nextInt();

	for (i = 1; i <= num1 || i <= num2; i++) 
	{    
		if (num1 % i == 0 && num2 % i == 0)       
			HCF = i;
	}
	System.out.println("HCF of given two numbers = " + HCF);  
}
}
