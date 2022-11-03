package Thrusdaylab;


public class Msg1
{
    public static void main(String args[])
    {
        Msg t1= new Msg("ON");                   //parameter passing
        Msg t2= new Msg("OFF");       
        System.out.println("Display output....");
        t1.start();
        t2.start();
    }
}