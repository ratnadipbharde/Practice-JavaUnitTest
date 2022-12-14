package com.userregistrationvalidationprogram;

import junit.framework.TestCase;

import java.util.ArrayList;

public class UserRegistrationValidationTest extends TestCase {

    public void testValidateFirstName() {
        assertTrue("assertTrue-Pass", new UserRegistrationValidation().validateFirstName("Ratnadip"));
        assertFalse("assertFalse-pass",new UserRegistrationValidation().validateFirstName("ratnadip"));

    }

    public void testValidateLastName() {
        assertTrue(new UserRegistrationValidation().validateLastName("Bharde"));
    }

    public void testValidateEmail() {
        assertTrue(new UserRegistrationValidation().validateEmail("ratnadipbharde@gmail.com"));
    }

    public void testValidateMoble() {
        assertTrue(new UserRegistrationValidation().validateMoble("8983253934"));
    }

    public void testTestValidateEmail() {
    ArrayList<String>list=new ArrayList<>();
    list.add("abc@gmail.com");
    list.add("123@gmail.co.in");
    list.add("adfvsdfgbc@yahoomail.com");
    list.add("345dfs@zapakmail.com");
    list.add("fgh.fd@india.com");
    list.add("345sdf.cvb@gmail.com");
        for (String i : list)
            assertTrue(new UserRegistrationValidation().validateEmail(i));
    }
}