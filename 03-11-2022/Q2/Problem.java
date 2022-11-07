package Thrusdaylab;

public class Problem
{
	int materials;         
    boolean available = false;
    // synchronized method to get a true or false
    public synchronized int get()                        
    {
    	// for checking false condition
          while (available == false)                      
          {
                try
                {
                      wait();                             // if false problem will go to wait
                }
                catch (InterruptedException ie)           
                {
                }
          }
          available = false;                             // material not available
          notifyAll();
          return materials;                               //return material to the method
    }
    // synchronized method for true conditions
    public synchronized void put(int value)               
    {
    	  // for checking true condition
          while (available == true)                     
          {
                try
                {
                      wait(); 
                }
                catch (InterruptedException ie) 
                {
                      ie.printStackTrace();
                }
          }
          materials = value;                               // material available in a value
          available = true;                                 // material available here
          notifyAll();
    }

}
