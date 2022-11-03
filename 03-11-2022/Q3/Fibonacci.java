package Thrusdaylab;

public class Fibonacci extends Thread	//extending Thread class
{
    public void run()	
    {
    	  try 
          {
              int a=0, b=1, c=0,n=10;
              System.out.println("\n Fibonacci series:");            //print
              while (n>0)				                     
              {
                   System.out.print(c+" ");
                   a=b;
                   b=c;
                   c=a+b;
                   n=n-1;
              }
       
          } 
          catch (Exception e) 
          {
        	  e.printStackTrace();
          }
        
    }
}