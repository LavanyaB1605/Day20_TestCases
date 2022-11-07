import java.util.Scanner;

public class Day20_Uc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String LastName = sc.nextLine();
        String RegEx = "[A-Z][a-z]{3,}";
        boolean check = LastName.matches(RegEx);
        if (check) {
            System.out.println("Entered name is valid");
        } else {
            System.out.println("Entered name is not valid");
        }
    }
}
