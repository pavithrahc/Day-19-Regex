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
			String pattern = "^[a-zA-Z]+([_+-.][a-zA-Z])*[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2})*$";

			Scanner scanner = new Scanner(System.in);
			System.out.print("Please Enter email:");

			String email = scanner.next();

			boolean isValid = validate(pattern, email);

			if (isValid) {
				System.out.println("This is valid email .");
			} else {
				System.out.println("Not a valid email");
			}
		}

	}