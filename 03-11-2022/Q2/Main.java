package Thrusdaylab;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Problem pc = new Problem(); 
		ProducerClass p1 = new ProducerClass(pc, 1);
		Consumer c1 = new Consumer(pc, 2);  
	    c1.start();                                  
	    p1.start();  
	}

}