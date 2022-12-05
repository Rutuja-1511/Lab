package Thrusdaylab;

import java.util.Scanner;

public class Bank 
{
	static long bal=5000;			                                                //class variable
	static long amt; 
	static Scanner sc = new Scanner(System.in);   
	
	Bank()				                                                          // Default constructor
	{
		System.out.println("Your Bank Balance is: "+bal);
	}
	
	Bank(long amt)			                                                      //for deposit amount
	{
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        bal = bal+ amt;  
		System.out.println("Your Bank Balance is: "+bal);
	}
	
	Bank(long amt,int a)			                                                   //for withdrawal amount
	{
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (bal >= amt) {  					                                                    //if balance
            bal = bal - amt;  
            System.out.println("Balance after withdrawal: " + bal);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
	}
	
public static void main(String[] args) 
{ 
	int ch;  
     char ans;
	do {  
         System.out.println("\n **Banking System Application**");  
         System.out.println("1. Display Bank Balance \n 2. Deposit the amount \n 3. Withdraw the amount \n 4.Exit ");  
         System.out.println("Enter your choice: ");  
         ch = sc.nextInt();  
         switch (ch)
         {  
        case 1:  		                                                                 	//show bank balance
        	new Bank();
         break; 
      case 2: 				                                                         //show deposit amount
    	   new Bank(0);
      break;  
        case 3:  	                                                                    //show withdrawal amount
        	new Bank(0,0);
             break;  
       case 4:                                                                                   	//for exit
        System.out.println("Thank you....");  
        break;  
         }  System.out.println("Do you want to addd another item y/n");
			ans=sc.next().charAt(0);
		}
		while (ch != 4); 
		while(ans=='Y'||ans=='y');
 
}  
}
