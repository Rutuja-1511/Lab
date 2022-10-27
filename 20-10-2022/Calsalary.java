package Thrusdaylab;

import java.util.Scanner;

public class Calsalary extends EmpInfo                           //extended class
{
	static int size;
	int tot_exp=0;
	
		
	public void emp_details()			                           //accept details of employees
	{
    	char ch;
    	System.out.println("Enter Employee's Id : ");
    	emp_id=sc.nextInt();
    	System.out.println("Enter Employee's Name : ");
    	name=sc.next();
    	System.out.println("Enter Employee's Address : ");
    	address=sc.next();
    	System.out.println("Enter Employee's Phone no : ");
    	pNo=sc.nextLong();
    	System.out.println("Enter Employee's Salary : ");
    	salary=sc.nextInt();
    	setSalary(salary);
    	
    	System.out.println("Expence Details: ");
    	do 
    	{	
    		System.out.println("\nEnter reason of spending moeny : ");
    		String reason=sc.next();
    		System.out.println("Enter Expenses :");
    		expence=sc.nextInt();
    		
    		tot_exp=tot_exp + expence;
    		
    		System.out.println("Do you want add more expenses? y/n");
    		ch=sc.next().charAt(0);
    	}
    	while(ch=='y'|| ch=='Y');
    }
    
    public void display()				                            //displaing details of employees
    {
    	System.out.println("Employee's ID : "+emp_id);
    	System.out.println("Employee's Name : "+name);
    	System.out.println("Employee's Address : "+address);
    	System.out.println("Employee's Phone No. : "+pNo);
    	System.out.println("Employee's Salary : "+salary);
    	System.out.println("Total Expenses of "+name+": "+tot_exp);
    	
    	System.out.println("Final highest salary of the employee "+(salary - tot_exp));
    }


public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. of employee: ");
	size=sc.nextInt();
	Calsalary emp[]=new Calsalary[size];
	
	for(int i=0;i<size;i++)					                                   //For loop for array
	{
		emp[i]=new Calsalary();
		emp[i].emp_details();
	}
	
	max_salary=emp[0].getSalary();			                                   
	
	for(int i=1;i<size;i++)
	{
												                       
		if(emp[i].getSalary() > max_salary)		
		{
			max_salary = emp[i].getSalary();
		}
	}
	for(int i=0;i<size;i++) 
	{
		
		if(emp[i].getSalary()==max_salary)			                           //checking max salary 
		{
			System.out.println("Employee Details with Highest Salary ");
			emp[i].display();
		}
	}
	
}

}