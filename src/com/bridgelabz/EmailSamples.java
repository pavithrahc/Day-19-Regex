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
public class EmailSamples {

	/**
	 * @param args
	 */
	static boolean validate(String pattern, String text) {
		
		return Pattern.compile(pattern).matcher(text).matches();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Regex");
		String pattern = "^[a-zA-Z]+[@][a-zA-Z]+[.][a-z]{2,3}$";//abc@yahoo.com,
		String pattern1 = "^[a-zA-Z]+[-][0-9]+[@][a-zA-Z]+[.][a-z]{2,3}$";//abc-100@yahoo.com,
		String pattern2 = "^[a-zA-Z]+[.][0-9]+[@][a-zA-Z]+[.][a-z]{2,3}$";//abc.100@yahoo.com
		String pattern3 = "^[a-zA-Z]+[0-9]+[@][a-zA-Z]+[.][a-z]{2,3}$";//abc111@abc.com,
		String pattern4 = "^[a-zA-Z]+[-][0-9]+[@][a-zA-Z]+[.][a-z]{2,3}$";//abc-100@abc.net,
		String pattern5 = "^[a-zA-Z]+[.]0-9]+[@][a-zA-Z]+[.][a-z]{2,3}[.][a-z]{2,3}$";//abc.100@abc.com.au
		String pattern6 = "^[a-zA-Z]+[@][0-9]+[.][a-z]{2,3}$";//abc@1.com,		
		String pattern7 = "^[a-zA-Z]+[@][a-zA-Z]+[.][a-z]{2,3}[.][a-z]{2,3}$";// abc@gmail.com.com
		String pattern8 = "^[a-zA-Z]+[+][0-9]+[@][a-zA-Z]+[.][a-z]{2,3}$";//abc+100@gmail.com
		
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

	}

}
