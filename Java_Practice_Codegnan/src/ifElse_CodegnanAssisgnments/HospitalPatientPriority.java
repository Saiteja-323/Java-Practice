package ifElse_CodegnanAssisgnments;
import java.util.Scanner;

public class HospitalPatientPriority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter body temperature (in Fahrenheit or Celsius as per hospital use): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter oxygen level (SpO2): ");
        int oxygenLevel = sc.nextInt();

        if (oxygenLevel < 90) {
            System.out.println("Priority: Emergency");
        } else if (temperature > 102 && age > 60) {
            System.out.println("Priority: High Priority");
        } else {
            System.out.println("Priority: Normal Priority");
        }

        sc.close();
    }
}