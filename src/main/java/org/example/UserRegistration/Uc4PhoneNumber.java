package org.example.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uc4PhoneNumber {
    static boolean Uc4PhoneNumberValidation(String num) {
        String RegEx1 = "[91]{2} [6-9]{1}[0-9]{9}";
        boolean check2 = num.matches(RegEx1);
        if (check2) {
            System.out.println("Entered number is valid");
        } else {
            System.out.println("Entered number is not valid");
        }
        return check2;
    }
}
