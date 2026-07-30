package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phonenumbervalidation {

	public static void main(String[] args) {
		   String s="8790947025";
		   String exp="[6789][0-9]{9}";
		   
		   Pattern p=Pattern.compile(exp);
		   Matcher m=p.matcher(s);
		   if(m.matches())
			   System.out.println("valid phone number");
		   else
			   System.out.println("Invalid phone number");


	}

}
