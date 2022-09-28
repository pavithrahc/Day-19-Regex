/**
 * 
 */
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author PAVITHRA C
 *
 */
public class RegexExpression {

	/**
	 * @param args
	 */
	public static boolean checkValidPincode(String firstName) {
		String firstNameRegex= "^[A-Z]{1}[A-Za-z]{2,}$";
		Pattern pattrenObject= Pattern.compile(firstNameRegex);
		
		if(firstName==null) {
			return false;
			
		}
		Matcher matcherObject = pattrenObject.matcher(firstName);
        return matcherObject.matches();
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("----- Welcome To Pin Code Validatior -----");
		
		String firstName ="Pavi";
		boolean isfirstName = checkValidPincode(firstName);
		
		if(isfirstName)
			System.out.println(firstName+" is an Valid firstName");
		else
			System.out.println(firstName+" is an Invalid firstName");
	}

}
	

