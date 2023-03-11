package com.bridgelabz.javarejex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationCases {
    Scanner scanner = new Scanner(System.in);

    public void enterFirstName() {
        System.out.println("Enter the First name starts with Cap and has minimum 3 characters");
        String firstName = scanner.next();
        String regex = "^[A-Z][a-z]{2,}$";
        System.out.println(firstName + " = " + firstName.matches(regex));
    }
    public void enterLastName() {
        System.out.println("Enter the Last name starts with Cap and has minimum 3 characters");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName));
    }

    public void enterValidEmail() {
        System.out.println("Enter the Email\n" + "Hint: Email has 3 mandatory parts (abc, bl & co) "
                + "and 2 optional (xyz & in) with " + "precise @ and . positions");
        String email = scanner.next();
        System.out.println(Pattern.matches("^[a-zA-Z\\d+_.-]+@[bl.co|bl.in]+$", email));
    }

    public void enterMobileNumber() {
        System.out.println("Enter the Mobile Number\n" + "Hint: Country code follow 10 digit number");
        String mobileNumber = scanner.nextLine();
        System.out.println(Pattern.matches("^[91]{2}[\\s][6-9][0-9]{9}$", mobileNumber));
    }
}

