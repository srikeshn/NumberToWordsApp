package com.srikesh.converter;

import java.util.Scanner;

import com.srikesh.converter.resource.NumberToWordsConverter;
import com.srikesh.converter.utils.StringUtils;

public class Main {

	public static void main(String[] args) {
		String option;
		Scanner input = new Scanner(System.in);
		boolean proceed = false;
		do {
			try {
				System.out.println("Enter the number between [0 - 999999999] to convert into words :");
				Integer numberToBeConverted = StringUtils.sanitize(input.nextLine());
				System.out.println(new NumberToWordsConverter().convertToWords(numberToBeConverted));
				System.out.println("Do you want to test again yes/no :");
				option = input.nextLine();
				proceed = userDecision(option);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Do you want to test again yes/no :");
				option = input.nextLine();
				proceed = userDecision(option);
			}
		} while (proceed);
		input.close();
	}

	private static boolean userDecision(String option) {
		if (option.equalsIgnoreCase("yes")) {
			return true;
		} else if (option.equalsIgnoreCase("no")) {
			System.out.println("Bye...");
			return false;
		}
		else {
			System.out.println("Invalid option, Application Terminated.");
			return false;
		}
	}

}
