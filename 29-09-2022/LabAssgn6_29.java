package Daily_Assignment;

//WAP to display prime no between 1 to 150 in two dimension array 

public class LabAssgn6_29 {


	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		int i,ans,n=150;
        System.out.println("Prime numbers between 1 to 150 are ");
        for(int j=2;j<=n;j++)
        {
        	ans=0;
        	for(i=1;i<=j;i++)
        	{
        		if(j%i==0)
        		{
        			ans++;        
        		}
        	}
        	if(ans==2)
        		System.out.print(j+"  ");     
        }
	}

}
