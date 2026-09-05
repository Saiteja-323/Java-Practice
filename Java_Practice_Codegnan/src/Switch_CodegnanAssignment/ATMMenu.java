package Switch_CodegnanAssignment;
import java.util.Scanner;
public class ATMMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Mini Statement");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your balance is ₹25,000");
                break;
            case 2:
                System.out.println("Enter amount to deposit");
                break;
            case 3:
                System.out.println("Enter amount to withdraw");
                break;
            case 4:
                System.out.println("Displaying mini statement...");
                break;
            case 5:
                System.out.println("Thank you for using our ATM.");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
