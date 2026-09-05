package ifElse_CodegnanAssisgnments;
import java.util.Scanner;
public class internetBankingTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter transfer amount: ");
        double transferAmount = sc.nextDouble();

        System.out.print("Is account active? (true/false): ");
        boolean isActive = sc.nextBoolean();

        if (isActive) {
            if (balance >= transferAmount) {
                System.out.println("Transaction Successful");
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Account Blocked");
        }

        sc.close();
    }
}
