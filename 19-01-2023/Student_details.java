package SQL;

import java.util.Scanner;

public class Student_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//Create_demo obj= new Create_demo();
			//	obj.Create_table();
		Select obj= new Select();
		Insert obj1= new Insert();
		Update_demo obj2= new Update_demo();
		Delete obj3= new Delete();
		
		System.out.println("... Hello Welcome ...");
		int ch;
		  char ans;		 
		  Scanner sc=new Scanner(System.in);			
		
		do 
		{
			System.out.println("Please select one option....");
			System.out.println("\n 1: Select \n 2: Insert \n 3: Update \n 4: Delete ");  
			
			ch = sc.nextInt();					
			
			switch(ch)				
			{
				case 1:
					obj.selectData();
					break;
			
				case 2:
					obj1.insertData();
					break;
		
				case 3:
					obj2.updateData();
					break;
		
				case 4:
					obj3.deleteData();
					break;
	
				default:
			System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue y/n"); 		
		    ans=sc.next().charAt(0);	
		}
		while(ans=='Y'||ans=='y');
	}
}