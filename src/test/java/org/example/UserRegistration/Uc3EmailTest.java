package org.example.UserRegistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class Uc3EmailTest {
    @Test
    public void Uc3EmailValidationTest() {
        Uc3Email uc3Email = new Uc3Email();
        //assertTrue(true);
        assertTrue(uc3Email.Uc3EmailValidation("lavanya.bhas12@gmail.co.au"));
    }

    @Test
    public void Uc3EmailValidationTestWithoutDomainShouldFail() {
        Uc3Email uc3Email = new Uc3Email();
        assertFalse(uc3Email.Uc3EmailValidation("abc123.com"));

    }
}