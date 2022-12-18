package com.userregistrationvalidationprogram;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class UserRegistrationValidationTest {
    @Test
    public void testValidateFirstName() {
        Assert.assertTrue("assertTrue-Pass", new UserRegistrationValidation().validateFirstName("Ratnadip"));
        Assert.assertFalse("assertFalse-pass", new UserRegistrationValidation().validateFirstName("ratnadip"));

    }

    @Test
    public void testValidateLastName() {
        Assert.assertTrue(new UserRegistrationValidation().validateLastName("Bharde"));
    }

    @Test

    public void testValidateEmail() {
        Assert.assertTrue(new UserRegistrationValidation().validateEmail("ratnadipbharde@gmail.com"));
    }

    @Test
    public void testValidateMoble() {
        new UserRegistrationValidation().validateMoble("8983253934");
    }

    @Test
    public void testTestValidateEmail() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc@gmail.com");
        list.add("123@gmail.co.in");
        list.add("adfvsdfgbc@yahoomail.com");
        list.add("345dfs@zapakmail.com");
        list.add("fgh.fd@india.com");
        list.add("345sdf.cvb@gmail.com");
        for (String i : list)
            Assert.assertTrue(new UserRegistrationValidation().validateEmail(i));
    }

    @Test
    public void validatePassword() {
        Assert.assertTrue(new UserRegistrationValidation().validatePassword("Pass@123"));
    }
}