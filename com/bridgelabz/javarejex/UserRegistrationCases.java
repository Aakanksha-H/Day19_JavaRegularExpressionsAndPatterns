package com.bridgelabz.javarejex;

import java.util.Scanner;

public class UserRegistrationCases {
    Scanner scanner = new Scanner(System.in);

    public void enterFirstName() {
        System.out.println("Enter the First name starts with Cap and has minimum 3 characters");
        String firstName = scanner.next();
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(firstName + " = " + firstName.matches(regex));
    }
}

