package Comparable;

import java.util.Arrays;

public class EmpDriver {


	public static void main(String[] args) {

                  Emp e1=new Emp("Ram",     64, 1);
                  Emp e2=new Emp("Raju",    32, 3);
                  Emp e3=new Emp("Raveesh", 32, 3);
                  Emp e4=new Emp("satheesh",30, 4);
                  Emp e5=new Emp("madam",   74, 8);
                  Emp e6=new Emp("ifthar",  24, 3);
                  Emp e7=new Emp("suktharm",44, 0);
                  
                  Emp[] e= {e1,e2,e3,e4,e5,e6,e7};
                  Arrays.sort(e);
                  for(Emp emp:e)
                	  System.out.println(emp);
	}
	

}
