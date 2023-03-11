package com.bridgelabz.javarejex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
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

    public void enterPassword() {
        System.out.println("Enter password \n" + "Hint: Password should have minimum 8 Characters and at least 1 Upper Case letter" +
                "and at least 1 numeric number and has exactly 1 special character");
        String password = scanner.next();
        System.out.println(Pattern.matches("/^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}", password));
    }

    public void emailValidation() {
        ArrayList<String> emailSamples = new ArrayList<>();

        emailSamples.add("abc@yahoo.com");
        emailSamples.add("abc-100@yahoo.com");
        emailSamples.add("abc.100@yahoo.com");
        emailSamples.add("abc111@abc.com");
        emailSamples.add("abc-100@abc.net");
        emailSamples.add("abc.100@abc.com.au");
        emailSamples.add("abc@1.com");
        emailSamples.add("abc@gmail.com.com");
        emailSamples.add("abc+100@gmail.com");

        emailSamples.add("abc");
        emailSamples.add("abc@.com.my");
        emailSamples.add("abc123@gmail.a");
        emailSamples.add("abc123@.com");
        emailSamples.add("abc123@.com.com");
        emailSamples.add(".abc@abc.com");
        emailSamples.add("abc()*@gmail.com");
        emailSamples.add("abc@%*.com");
        emailSamples.add("abc..2002@gmail.com");
        emailSamples.add("abc.@gmail.com");
        emailSamples.add("abc@abc@gmail.com");
        emailSamples.add("abc@gmail.com.1a");

        for (String emails : emailSamples) {
            String email = "^([a-zA-Z0-9]|([-.+][0-9]))+@(([a-zA-Z0-9]))+(([.]+[a-zA-Z]{2,3})|([.]+[a-zA-Z]{2,3})+([.]+([a-zA-Z]{2,3})))$";
            Pattern pattern = Pattern.compile(email);
            Matcher matcher = pattern.matcher(emails);

            if (matcher.matches()) {
                System.out.println("Valid email : " + emails + " : " + matcher.matches());
            } else {
                System.out.println("Invalid email : " + emails + " : " + matcher.matches());
            }
        }
    }
}

