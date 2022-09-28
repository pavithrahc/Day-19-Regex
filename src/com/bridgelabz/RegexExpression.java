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
			String pattern ="^[A-Z]{1}[a-zA-Z0-9]{1,}[!@#$%^&]{1,}[a-zA-Z0-9]{1,}$";


			Scanner scanner = new Scanner(System.in);
			System.out.print("Please Enter password:");

			String  password= scanner.next();

			boolean isValid = validate(pattern, password);

			if (isValid) {
				System.out.println("This is valid password .");
			} else {
				System.out.println("Not a valid password");
			}
		}

	}