package org.example.UserRegistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class Uc2LastNameTest {
    @Test
    public void Uc2LastNameValidationTest() {
        Uc2LastName uc2LastName = new Uc2LastName();
        //assertTrue(true);
        assertTrue(uc2LastName.Uc2LastNameValidation("Bhaskaran"));
    }

    @Test
    public void validateLastNameLowerCaseShouldFail() {
        Uc2LastName uc2LastName = new Uc2LastName();
        assertFalse(uc2LastName.Uc2LastNameValidation("bhaskaran"));
    }

    @Test
    public void validateLastNameLessThanThree() {
        Uc2LastName uc2LastName = new Uc2LastName();
        assertFalse(uc2LastName.Uc2LastNameValidation("bha"));
    }
}