package Thrusdaylab;

public class ProducerClass extends Thread
{
	//use the thread class property
	Problem  Shop;   //variables declared used by class name   
  	int number;          
  //creating parameterized constructor
 public ProducerClass(Problem c, int number) 
 {
       Shop = c;
       this.number = number;	//use this keyword for use the same class variable
 }
//create run method
 public void run()				
 {
       for (int i = 0; i < 10; i++)  
       {
             
             System.out.println("Produced value " + this.number+ " put: " + i);
           //use try block where exception show
             try						
             {
            	
                   sleep((int)(Math.random() * 100));	//sleep method of thread
             }
           //catch block to handle the exception
             catch (InterruptedException ie)		
             {
                 System.out.println(ie);			//print the exception.......
             }
       }
 }
}

