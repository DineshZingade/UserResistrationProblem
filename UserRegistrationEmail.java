package com.bridgelabz.UC2lastname;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationEmail {
	Scanner sc = new Scanner(System.in);

	public void firstNameCheck() {
		System.out.print("Enter First Name of User: ");
		String fName = sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
		if (check)
			System.out.println("Perfect! FirstName");
		else
			System.out.println("Please Enter a Valid First Name");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration user = new UserRegistration();
		System.out.println("Welcome to User Registration Program");
		user.firstNameCheck();
		user.lastNameCheck();
		user.email();
	}

	public void lastNameCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Last Name of User: ");
		String lName = sc.next();
		boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
		if (check)
			System.out.println("Perfect! LastName");
		else
			System.out.println("Please Enter a Valid Last Name");
	}

	public void email() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Email of User: ");
		String eMail = sc.next();
		boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", eMail);
		if (check)
			System.out.println("Perfect! Email!");
		else
			System.out.println("Please Enter a Valid Email");
	}
}