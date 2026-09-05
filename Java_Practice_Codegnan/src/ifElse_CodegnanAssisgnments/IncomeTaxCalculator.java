package ifElse_CodegnanAssisgnments;
import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();

        double taxPercent;

        if (income <= 400000) {
            taxPercent = 0;
        } else if (income <= 800000) {
            taxPercent = 5;
        } else if (income <= 1200000) {
            taxPercent = 10;
        } else if (income <= 2000000) {
            taxPercent = 20;
        } else {
            taxPercent = 30;
        }

        System.out.println("Applicable tax percentage: " + taxPercent + "%");

        sc.close();
    }
}
