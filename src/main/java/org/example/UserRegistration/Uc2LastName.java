package org.example.UserRegistration;

import java.util.Scanner;

public class Uc2LastName {
        static boolean Uc2LastNameValidation(String lastname) {
        String RegEx = "[A-Z][a-z]{3,}";
        boolean check = lastname.matches(RegEx);
        if (check) {
            System.out.println("Entered name is valid");
        } else {
            System.out.println("Entered name is not valid");
        }
            return check;
        }
}
