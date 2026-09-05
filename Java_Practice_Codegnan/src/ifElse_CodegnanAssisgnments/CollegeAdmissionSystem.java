package ifElse_CodegnanAssisgnments;
import java.util.Scanner;
public class CollegeAdmissionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter entrance exam rank: ");
        int rank = sc.nextInt();
        System.out.print("Enter intermediate percentage: ");
        double percentage = sc.nextDouble();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (rank <= 1000 && percentage >= 75) {
            if (age >= 17) {
                System.out.println("Admission Confirmed");
            } else {
                System.out.println("Not eligible: Age must be 17 or above.");
            }
        } else {
            System.out.println("Not eligible: Rank or percentage criteria not satisfied.");
        }
        sc.close();
    }
}