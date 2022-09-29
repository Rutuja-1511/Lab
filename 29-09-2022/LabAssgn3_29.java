package Daily_Assignment;

//WAP to accept a no from user and check it is prime or not.
Pass this number in different function and check it is even or odd. 
IF number is even than check it is divisible by 10 or not in different function
and is no is odd than check it is divisible by 3 or not in different function//

import java.util.Scanner;

public class LabAssgn3_29
{

 public static void main(String[] args)
{
	 LabAssgn3_29 obj=new LabAssgn3_29();
		int num=obj.prime();		
		obj.evenOdd(num);			
		obj.divisible10(num);
		obj.divisible3(num);
}
	
	public int prime()
{
		Scanner sc=new Scanner(System.in);
		int num,i,ans=0;
		System.out.println("Enter The Number ");
		num = sc.nextInt(); 
		for(i=2;i<num;i++)			  	
{
	if(num%i==0)
{
	  ans++;
    break;
}
}
	if(ans==0)                       
	    System.out.println(+num+" is a Prime Number.");                                                               
	else
	    System.out.println(+num+" is not a Prime Number."); 
		
	return num;			
}
	
	public void evenOdd(int num)
{
	int evenNo=0,oddNo=0;
	if(num%2==0)						
{
		evenNo=num;
		System.out.println("Number is Even =" +evenNo);
}
	else
{
		oddNo=num;
		System.out.println("Number is Odd =" +oddNo);
}
		
}
	public void divisible10(int num)
{
	if(num%10==0)	
		System.out.println("Number is divisible by 10");
	else
		System.out.println("Number is not divisible by 10");
}
	
	public void divisible3(int num)
	{
		if(num%3==0)	
			System.out.println("Number is divisible by 3");
		else
			System.out.println("Number is not divisible by 3");
	}	
}
