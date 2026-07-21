package Trainglepatt;

public class Halopatt {
	public static void main(String[] args) {
		
		int n=5;
		int sp=0;
		int st=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++) { System.out.print(" ");
		}
			for(int k=1;k<=st;k++) {
				if(i==1||k==1||k==st)
				{

					System.out.print("* ");
				}
			
				else
				{
					System.out.print(" ");
					
				}	
				}
				System.out.println();
				sp++;
				st--;
			}
	}
}

		
	

	
