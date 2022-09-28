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
	static boolean validate(String pattern, CharSequence num) {
		return Pattern.compile(pattern).matcher(num).matches();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Regex");
			String pattern ="^(91)[-.+]{1}[1-9]{1}[0-9]{9}$";

			Scanner scanner = new Scanner(System.in);
			System.out.print("Please Enter mobile number:");

			CharSequence num = scanner.next();

			boolean isValid = validate(pattern, num);

			if (isValid) {
				System.out.println("This is valid number .");
			} else {
				System.out.println("Not a valid number");
			}
		}

	}