package sortings;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		 int[] a= {2,6,3,2,6,2,7};
		  sort(a);
		  System.out.println(Arrays.toString(a));
	}

	 public static void sort(int[] a)
	 {
		 for(int i=0;i<a.length;i++)
		 {
			 int minindex=i;
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[j]>a[minindex])
				   minindex=j;
			 }
		
					 int temp=a[i];
					 a[i]=a[minindex];
					 a[minindex]=temp;
				 }
	 }
}


