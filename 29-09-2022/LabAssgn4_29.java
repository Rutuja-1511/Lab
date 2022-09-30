package Daily_Assignment;

// WAP to accept size from user accordingly accept numbers from user and also accept
//the no from user which you want to delete from your array and display the output.

import java.util.Scanner;

public class LabAssgn4_29 
{
  
	public static void main(String[] args) 
	{
	int a,delete,size;
	char ans;
	Scanner in=new Scanner(System.in);
	do
	{
	System.out.println("Enter size of array");
	size=in.nextInt();
	int n[]=new int[size];
	System.out.println("Enter array elements");
    for(a=0;a<size;a++)
	{
		n[a]=in.nextInt();
	}
	System.out.println("The elements in array are:");
	for(a=0;a<size;a++)
	{
		System.out.print("\t");
		System.out.print(n[a]);
	}
	System.out.println("\nEnter no which u want to delete..");
	delete=in.nextInt();
	System.out.println("Updated array:");
	for(a=0;a<size;a++)
	{
		if(n[a]!=delete)
		{
			int n1[]=new int[size];
			n1[a]=n[a];
			System.out.print("\t"+n[a]);
		}
		
	}
	System.out.println("\nDo you want to continue? (y/n)");
	ans=in.next().charAt(0);
	}while(ans=='y'||ans=='Y');
	}

}
