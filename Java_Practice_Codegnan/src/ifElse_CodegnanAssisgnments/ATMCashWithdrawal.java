package ifElse_CodegnanAssisgnments;
import java.util.Scanner;

public class ATMCashWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234; // you can change this as needed

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == correctPin) {
            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = sc.nextDouble();

            if (withdrawalAmount <= balance) {
                System.out.println("Collect Your Cash");
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Incorrect PIN");
        }

        sc.close();
    }
}