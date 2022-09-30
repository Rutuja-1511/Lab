package Daily_Assignment;

//WAP to accept no from user in array and find out average and sum of array numbers.

import java.util.Scanner;

public class LabAssgn5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size,a,sum = 0,avg;
		
		System.out.println("Enter size : ");
		size=sc.nextInt();
		
		int no[]=new int[size];
		System.out.println("Enter "+size+" numbers:");
		
		for(a=0;a<size;a++) {
			no[a]=sc.nextInt();
		}
		for(a = 0; a < no.length; a++) {
			sum += no[a];
		}
		avg=sum/size;
		
		System.out.println("Sum of all elements in array = "+sum);
		System.out.println("Average of all elements in array = "+avg);
	}

}
