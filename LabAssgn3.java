package Daily_Assignment;

import java.util.Scanner;

public class LabAssgn3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int menu_item,menu1,i_price=0,quantity=0;
		char ans;
		String i_name="";
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Menu:\n1:Starters \n2:Main course \n3:Deserts \n4:Appetizer");
			menu_item=sc.nextInt();
			switch(menu_item)
			{
			case 1:
				System.out.println("1:Angara Kabab              \t\t 330Rs");
				System.out.println("2:Chicken lollipop          \t\t 180Rs");
				System.out.println("3:Paneer Chilly             \t\t 200Rs");
				menu1=sc.nextInt();
				switch(menu1)   //second switch for counting the bill,display item name and calculate quantity
				{
				case 1:
					i_price+=330;    
					i_name+="\nAngara Kabab ";  
					quantity+=1;     
					break;
				case 2:
					i_price+=180;
					i_name+="\nChicken lollipop";
					quantity+=1;
					break;
				case 3:
					i_price+=200;
					i_name+="\nPaneer Chilly";
					quantity+=1;
					break;
				default:
					System.out.println("Invalid choice");
						
				}
				break;
			case 2:
				System.out.println("1:Butter Chicken\t 400Rs");
				System.out.println("2:Palak Paneer\t\t 300Rs.");
				System.out.println("3:Chicken Dum Biryani \t\t 350Rs");
				menu1=sc.nextInt();
				switch(menu1)
				{
				case 1:
					i_price+=400;
					i_name+="\nButter Chicken";
					quantity+=1;
					break;
				case 2:
					i_price+=300;
					i_name+="\nPalak Paneer";
					quantity+=1;
					break;
				case 3:
					i_price+=350;
					i_name+="\nChicken Dum Biryani";
					quantity+=1;
					break;
				default:
					System.out.println("Invalid choice");
						
				}
				break;
			case 3:
				System.out.println("1:Rasmali Cakes    \t\t 500Rs");
				System.out.println("2:Ice Cream        \t\t 150Rs");
				System.out.println("3:Sizzling Brownie \t\t 200Rs");
				menu1=sc.nextInt();
				switch(menu1)
				{
				case 1:
					i_price+=500;
					i_name+="\n Rasmali Cakes";
					quantity+=1;
					break;
				case 2:
					i_price+=150;
					i_name+="\n Ice Cream";
					quantity+=1;
					break;
				case 3:
					i_price+=200;
					i_name+="\n Sizzling Brownie";
					quantity+=1;
					break;
				default:
					System.out.println("Invalid choice");
						
				}
				break;
			case 4:
				System.out.println("1:Mineral Water   \t\t 30Rs");
				System.out.println("2:Cocktail        \t\t 200Rs");
				System.out.println("3:Sprite           \t\t 50Rs");
				menu1=sc.nextInt();
				switch(menu1)
				{
				case 1:
					i_price+=30;
					i_name+="\n Mineral Water";
					quantity+=1;
					break;
				case 2:
					i_price+=200;
					i_name+="\n Cocktail";
					quantity+=1;
					break;
				case 3:
					i_price+=50;
					i_name+="\n Sprite";
					quantity+=1;
					break;
				default:
					System.out.println("Invalid choice");
						
				}
			
			}
			System.out.println("Do you want to add another item? y/n");   //for break or continue this all menu
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		System.out.println("Thanks for coming");
		System.out.println("The Food Items are:\n"+i_name);           //display item name
		System.out.println("The Total bill amount is:"+i_price);       //display price
		System.out.println("The Total Item Quantity is:"+quantity);       //display total  quantity
	}

}