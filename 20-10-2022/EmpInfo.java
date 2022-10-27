/*Accept some details from the employee
Accept Name, E_ID, phone_no,address, salary,Expenses(User) N number of employee
Calculate the highest salary,highest expense . Display the employee name who is getting highest salary*/

package Thrusdaylab;

import java.util.Scanner;

public class EmpInfo                              //public class
{
	Scanner sc=new Scanner(System.in);   
	
	int emp_id,salary,expence; 
	String name,address;	   
    long pNo;
	static int max_salary;
	   
	   
	   public int getSalary()     //getset method
	   {
		return salary;
	   }
	   
	   public void setSalary(int salary)
	   {
		   this.salary = salary;
	   }
}