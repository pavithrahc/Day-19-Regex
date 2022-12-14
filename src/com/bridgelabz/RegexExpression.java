/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * @author PAVITHRA C
 *
 */
public class RegexExpression {

	/**
	 * @param args
	 */
	static boolean validate(String pattern, String text) {
		
		return Pattern.compile(pattern).matcher(text).matches();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Regex");
		String pattern = "^[a-zA-Z0-9]+[@][a-zA-Z]+[.][a-z]{2,3}$";

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Enter value:=");

		String lastName = scanner.next();

		boolean isValid = validate(pattern, lastName);

		if (isValid) {
			System.out.println("This is valid Email ID .");
		} else {
			System.out.println("Not a valid ID");
		}
	}

}