import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {1234
        Scanner scanner = new Scanner(System.in);
        int initialBalance = 0;
        String pin = "1234";
        String enteredPin;
        int choice;

        System.out.println("Enter your pin: ");
        enteredPin = scanner.next();

        if (enteredPin.equals(pin)) {
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdrawal");
                System.out.println("3. Balance Enquiry");
                System.out.println("4. Change PIN");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        int depositAmount = scanner.nextInt();
                        initialBalance += depositAmount;
                        System.out.println("Amount deposited successfully!");
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        int withdrawalAmount = scanner.nextInt();
                        if (withdrawalAmount <= initialBalance) {
                            initialBalance -= withdrawalAmount;
                            System.out.println("Amount withdrawn successfully!");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                        break;
                    case 3:
                        System.out.println("Your current balance is: Rs." + initialBalance);
                        break;
                    case 4:
                        System.out.print("Enter the new PIN: ");
                        String newPin = scanner.next();
                        if (newPin.equals(pin)) {
                            System.out.println("ERROR!!! same pin cannot be accepted");
                        } else {
                            pin = newPin;
                            System.out.println("PIN changed successfully!");
                        }
                        break;
                    case 5:
                        System.out.println("Exiting the program...");
                        break;
                    default:
                        System.out.println("LOOK PROPERLY ! Please enter a valid choice.");
                }
            } while (choice != 5);
        } else {
            System.out.println("REMEMBER YOR PIN!!!! Please enter a valid pin.");
        }

        scanner.close();
    }
}
