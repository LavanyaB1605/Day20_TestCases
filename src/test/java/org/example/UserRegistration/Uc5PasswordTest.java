package org.example.UserRegistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class Uc5PasswordTest {
    @Test
    public void Uc5PasswordValidationTest() {
        Uc5Password uc5Password = new Uc5Password();
        assertTrue(uc5Password.Uc5PasswordValidation("Lavanya16!"));
    }

    @Test
    public void Uc5PasswordValidationWithoutUpperCaseShouldFail() {
        Uc5Password uc5Password = new Uc5Password();
        assertFalse(uc5Password.Uc5PasswordValidation("lavanya"));

    }

    @Test
    public void Uc5PasswordValidationWithoutNumberShouldFail() {
        Uc5Password uc5Password = new Uc5Password();
        assertFalse(uc5Password.Uc5PasswordValidation("Lavanya@"));
    }

    @Test
    public void Uc5PasswordValidationWithoutSpecialCharacterShouldFail() {
        Uc5Password uc5Password = new Uc5Password();
        assertFalse(uc5Password.Uc5PasswordValidation("Lavan123"));
    }

    @Test
    public void Uc5PasswordValidationWithoutMinimumCharacterShouldFail() {
        Uc5Password uc5Password = new Uc5Password();
        assertFalse(uc5Password.Uc5PasswordValidation("Lavan"));
    }
}