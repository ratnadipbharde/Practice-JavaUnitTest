package com.userregistrationvalidationprogram;

import java.util.regex.Pattern;

public class UserRegistrationValidation {
    public boolean validateFirstName(String firstName) {
        boolean result = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
        if(result) {
           System.out.println("First Name is Valid");
           return true;
        }
            System.out.println("Invalid Name ");
        return false;
    }

    public boolean validateLastName(String lastName) {
        boolean result = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
        if(result) {
            System.out.println("Last Name is Valid");
            return true;
        }
        System.out.println("Invalid Last Name ");
        return false;
    }

    public boolean validateEmail(String email){
        boolean result=Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",email);
        if(result) {
            System.out.println("Email is Valid");
            return true;
        }
        System.out.println("Invalid Email ");
        return false;
    }

    public boolean validateMoble(String mobileNumber){
        boolean result=Pattern.matches("^[0-9]{10,}$",mobileNumber);
        if(result) {
            System.out.println("Mobile Number is Valid");
            return true;
        }
        System.out.println("Invalid Mobile Number ");
        return false;
    }
}
