package org.example.UserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Uc1FirstName {
/*    static void Uc1FirstNameValidation(String firstname) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name:");
         firstname = sc.nextLine();
        String RegEx = "[A-Z][a-z]{3,}";
        boolean check = firstname.matches(RegEx);
        if (check) {
            System.out.println("Entered name is valid");
        } else {
            System.out.println("Entered name is not valid");
        }
    }*/
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("[A-Z][a-z]{3,}",firstName);
    }
}
