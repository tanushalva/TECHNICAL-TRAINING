
/*GIVEN A STRING S RETURN TRUE IF IT IS A VALID GMAILid.ELSE RETURN FALSE
abc@gmail//true 
12abc@gmail.com//false [userid should not start with any digits]
abc?123@gmail.com// false
abc.123@gmail.com //true
abc 123@gmail.com//
abc@mail.com// false */
import java.util.Scanner;
import java.lang.*;

public class useridchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Gmail: ");
        String email = scanner.nextLine();

        if (ValidEmail(email)) {
            System.out.println("TRUE!!!!");
        } else {
            System.out.println("FALSE!!!!!");
        }
        scanner.close();
    }

    public static boolean ValidEmail(String email) {
        if (!email.endsWith("@gmail.com")) {
            return false;
        }
        String userID = email.substring(0, email.indexOf('@'));
        if (!Character.isLetter(userID.charAt(0))) {
            return false;
        }
        for (int i = 0; i < userID.length(); i++) {
            char c = userID.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '.') {
                return false;
            }
        }
        return true;
    }
}
