package Thrusdaylab;

public class Reverse extends Thread
{
	public static void main(String[] args) 
	{
		Reverse obj=new Reverse();
		Fibonacci obj1=new Fibonacci();
		Thread t=new Thread(obj);		             //object of the Thread class
		Thread t1=new Thread(obj1);
		t.start();				                   // execution of thread
		t1.start();
		

	}
	public void run()		
	{
		  try 
          {
			  Thread.sleep(1000);	                                    //pause time
	          System.out.println("\nReverse Numbers: ");
	          for (int i=100;i>=1;i--)			                         // reverse no 
	          {
	               System.out.print(i+"  ");
	          }
          }
		  catch (Exception e) 
          {
        	  e.printStackTrace();
          }
	     
	  
	}
}