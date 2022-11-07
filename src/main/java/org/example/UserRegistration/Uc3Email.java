package org.example.UserRegistration;

public class Uc3Email {
    static boolean Uc3EmailValidation(String email) {
        String RegEx1 = "^[A-Za-z0-9+_.-]+@+[A-za-z]+.+[A-za-z]$";
        boolean check2 = email.matches(RegEx1);
        if (check2) {
            System.out.println("Entered ID is valid");
        } else {
            System.out.println("Entered ID is not valid");
        }
        return check2;
    }
}
