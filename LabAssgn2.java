package Daily_Assignment;

import java.util.*;

public class LabAssgn2 
{
    public static void main(String args[])
    {   
        int choice,num,i,fact=1,r,sum=0,temp,fn=0,res=1,tn;
        char ans;
        do
        {
        System.out.println("1:Factorial\n2:Sum of digit \n3:Number is Amstrong or not \n4:Fibonacci series\n5:Number is Prime or not");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your choce:");
        choice=in.nextInt();
        switch(choice)
        {
        case 1:
                System.out.println("Enter no");
                num=in.nextInt();
                for(i=1;i<=num;i++)
                {
                    fact=fact*i;
                }
                System.out.println("Factorial of "+num+" is " +fact);
        break;
        case 2:
                System.out.println("Enter the no:");
                 num=in.nextInt();
                while(num>0)
                 {
                 r=num%10;
                 sum=sum+r;
                 num=num/10;
                }
               System.out.println("Sum of digits = "+sum);
        break;
        case 3:
              System.out.println("Enter the no:");
              num=in.nextInt();
              temp=num;
              while(num>0)
              {
              r=num%10;
              sum=sum+(r*r*r);
              num=num/10;
              }
              if(temp==sum)
              System.out.println(temp+" is Armstrong Number");
              else 
              System.out.println(temp+" is not Armstrong Number");
        break;
        case 4:
               System.out.println("Enter the no:");
               num=in.nextInt();
               System.out.print(fn+" "+res);
               for(i=1;i<=num;i++)
               {
               tn=fn+res;
               System.out.print(" "+tn);
               fn=res;
               res=tn;
               }
              
        break;
        case 5:
              System.out.println("Enter the no:");
              num=in.nextInt();
              int m=0,flag=0;      
              m=num/2;      
              if(num==0||num==1)
              {  
              System.out.println(num+" is not prime number");      
              }
              else 
              {  
                  for(i=2;i<=m;i++)
                  {      
                  if(num%i==0)
                  {      
                  System.out.println(num+" is not prime number");      
                  flag=1;      
                  break;      
                  }      
                  }      
                  if(flag==0) 
                  { 
                  System.out.println(num+" is prime number");
                  }  
              
                }
            break;
            default:
            System.out.println("Please enter valid choice..");    
            }
            System.out.println("Do you want to continue with another operation(y/n)");
            ans=in.next().charAt(0);
        }
        while(ans=='y' ||ans=='Y');
        }
                 
}