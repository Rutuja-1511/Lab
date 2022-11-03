package Thrusdaylab;

public class Msg extends Thread
{
   String str;                         //global var
    public Msg(String s)
    {
        str=s;  
    }
    public void run()            //run method
    {
        while(true)                     // loop
        {   System.out.println((Thread.currentThread()).getName()+" "+"Hi "+str);            //printing msg
            System.out.println((Thread.currentThread()).getName()+" "+"Bye  "+(Thread.currentThread()).getPriority());
             
            try
            {
                Thread.sleep(5000);                //5sec sleep time
            }
            catch(InterruptedException ie)
            { 
                System.out.println(ie.toString());
            }           
        }
    }
}