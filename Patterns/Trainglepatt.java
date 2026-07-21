package Trainglepatt;

public class Trainglepatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=5;
       int sp=n-1;
       int st=1;
       
        for(int i=1;i<=n;i++)
        {
        	for(int k=1;k<=sp;k++)
        	{
        		System.out.print(" ");
        }
        	   for(int k=1;k<=st;k++)
        	   {
        		   if(k==1||i==n||k==st)
        		   {
        			   System.out.print("*");
        		   }
        	            else
        	        {
        		       System.out.print(" ");
        		  }
        	   }
        	   System.out.println();
        	   sp--;
        	   st+=2;
        }
	}
}


