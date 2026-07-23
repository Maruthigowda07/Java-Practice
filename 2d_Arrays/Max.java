package Twod_Arrays;

public class Max {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,3,5,4},{3,4,5,10}};
		int max=a[0][0];
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
          System.out.println(max);
	}

}

	
