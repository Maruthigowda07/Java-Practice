package regex;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {

            String s="Ntrmaruthi@72";
            String exp="(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).{6,16}";
            
            Pattern p=Pattern.compile(exp);
            Matcher m=p.matcher(s);
            if(m.matches())
            	System.out.println("Valid");
            else {
				System.out.println("invalid");		}

	}

}
