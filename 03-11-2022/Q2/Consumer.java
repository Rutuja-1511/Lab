package Thrusdaylab;

public class Consumer extends Thread
{
	Problem Shop;	                 //variables declared used by class name   
    int num,value = 0,i;               
   
    //create the construtor
    public Consumer(Problem c, int number)
    {
          Shop = c;
          this.num = number;             //use this keyword for use the same class variable...........
    }
    public void run()                    //create run method......
    {
          for ( i = 0; i < 10; i++)
          {
                System.out.println("Consumed value " + this.num+ " got: " + value);
          }
    }
}