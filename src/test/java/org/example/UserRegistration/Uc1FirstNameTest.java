package org.example.UserRegistration;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Uc1FirstNameTest {

    @Test
    public void validateFirstNameTest() {
        Uc1FirstName uc1FirstName = new Uc1FirstName();
        assertTrue(uc1FirstName.validateFirstName("Lavanya"));
    }

    @Test
    public void validateFirstNameLowerCaseShouldFail() {
        Uc1FirstName uc1FirstName = new Uc1FirstName();
        assertFalse(uc1FirstName.validateFirstName("lavanya"));
    }

    @Test
    public void validateFirstNameLessThanThree() {
        Uc1FirstName uc1FirstName = new Uc1FirstName();
        assertFalse(uc1FirstName.validateFirstName("la"));
    }
}