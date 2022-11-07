package org.example.UserRegistration;

import org.junit.Test;

import static org.junit.Assert.*;

public class Uc4PhoneNumberTest {
    @Test
    public void Uc4PhoneNumberTestValidation() {
        Uc4PhoneNumber uc4PhoneNumber = new Uc4PhoneNumber();
        assertTrue(uc4PhoneNumber.Uc4PhoneNumberValidation("91 9087654321"));

    }

    @Test
    public void Uc4PhoneNumberTestValidationWithWrongFormatShouldFail() {
        Uc4PhoneNumber uc4PhoneNumber = new Uc4PhoneNumber();
        assertFalse(uc4PhoneNumber.Uc4PhoneNumberValidation("919087654321"));
    }

    @Test
    public void Uc4PhoneNumberTestValidationWithLessNumberShouldFail() {
        Uc4PhoneNumber uc4PhoneNumber = new Uc4PhoneNumber();
        assertFalse(uc4PhoneNumber.Uc4PhoneNumberValidation("919087654"));
    }
}