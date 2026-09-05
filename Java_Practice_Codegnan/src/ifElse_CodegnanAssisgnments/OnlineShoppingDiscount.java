package ifElse_CodegnanAssisgnments;
import java.util.Scanner;

public class OnlineShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        System.out.print("Are you a premium member? (true/false): ");
        boolean isPremium = sc.nextBoolean();

        double discount = 0;

        if (isPremium) {
            if (amount > 10000) {
                discount = 0.20 * amount;
            } else if (amount > 5000) {
                discount = 0.10 * amount;
            } 
        } else {
            if (amount > 10000) {
                discount = 0.10 * amount;
            } else if (amount > 5000) {
                discount = 0.05 * amount;
            }
        }

        double finalAmount = amount - discount;

        if (discount > 0) {
            System.out.println("Discount applied: ₹" + discount);
        } else {
            System.out.println("No discount.");
        }
        System.out.println("Final amount to pay: ₹" + finalAmount);

        sc.close();
    }
}
