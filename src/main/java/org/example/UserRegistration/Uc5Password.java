package org.example.UserRegistration;

public class Uc5Password {
    static boolean Uc5PasswordValidation(String pwd) {
        String RegEx3 = "[A-Z][a-z0-9]{7,}[$&+,:;=?@#|'<>.-^*()%!]";
        boolean check3 = pwd.matches(RegEx3);
        if(check3) {
            System.out.println("Entered Password is valid");
        }
        else {
            System.out.println("Entered Password is not valid");
        }
        return check3;
    }

}
