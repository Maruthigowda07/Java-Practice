package Twod_Arrays;

public class SecMax {

	public static void main(String[] args) {
		int[][] a= {{2,3,4},{3,4,2,4,4},{3,4,2,10,20}};
		
		 int max=Integer.MIN_VALUE;
		 int secMax=Integer.MIN_VALUE;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
			 {
				 if(a[i][j]>max)
				 {
					 secMax=max;
					 max=a[i][j];
					 
				 }
				 else if(a[i][j]>secMax&&a[i][j]!=max)
				 {
					 secMax=a[i][j];				 }
			 }
		 }
	
	
		 System.out.println(secMax);
}

}
