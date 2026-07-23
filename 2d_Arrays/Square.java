package Twod_Arrays;

public class Square {

	public static void main(String[] args) {

               int[][] a= {{2,3,4,4},
            		   {3,2,4,2,3},
            		   {3,2,1,4,4}};
               for(int i=0;i<a.length;i++)
               {
            	   for(int j=0;j<a[i].length;j++)
            	   {
            		   a[i][j]=a[i][j]*a[i][j]*a[i][j];
            		   System.out.print(a[i][j] + " ");
            	   }
                            System.out.println();
               }
	}

}
