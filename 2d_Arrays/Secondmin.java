package Twod_Arrays;

public class Secondmin {

	public static void main(String[] args) {
		int[][] a= {{2,3,4},{3,4,2,4,4},{3,4,2}};
		
		 int min=Integer.MAX_VALUE;
		 int secMin=Integer.MAX_VALUE;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
			 {
				 if(a[i][j]<min)
				 {
					 secMin=min;
					 min=a[i][j];
					 
				 }
				 else if(a[i][j]<secMin&&a[i][j]!=min)
				 {
					 secMin=a[i][j];				 }
			 }
		 }
	
	
		 System.out.println(secMin);
}
}

