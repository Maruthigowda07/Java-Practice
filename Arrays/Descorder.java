package com.Arrays;

import java.util.Arrays;

public class Descorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int a[]= {2,5,4,14,12};
          sort(a);
      System.out.println(Arrays.toString(a));    
	}
	public static void sort(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}

