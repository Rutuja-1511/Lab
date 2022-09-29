package Daily_Assignment;

import java.util.Scanner;

public class LabAssgn_29 
   {
	
	public static void main(String[] args) 
	{	
		int i,sum1=0,sum2=0,num;
        char ans;
	 Scanner sc=new Scanner(System.in);
	do
	{
	System.out.print("Enter number: ");       
	 num=sc.nextInt(); 
				
		if(num%2==0)
	{
	    sum2=sum2+num;
	}
		else
	{
		sum1=sum1+num;
	}
							
	System.out.println("Do you want to add another number  y/n"); 
		ans=sc.next().charAt(0);
	}
	while(ans=='Y'||ans=='y');
			System.out.println("Sum of Even Numbers = "+sum2);
			System.out.println("Sum of Odd Numbers = "+sum1);
	}

	}
