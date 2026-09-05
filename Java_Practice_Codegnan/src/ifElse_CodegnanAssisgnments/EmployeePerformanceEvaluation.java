package ifElse_CodegnanAssisgnments;
import java.util.Scanner;
public class EmployeePerformanceEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter performance score (0–100): ");
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("Rating: Outstanding");
        } else if (score >= 80) {
            System.out.println("Rating: Excellent");
        } else if (score >= 70) {
            System.out.println("Rating: Good");
        } else if (score >= 60) {
            System.out.println("Rating: Average");
        } else {
            System.out.println("Rating: Needs Improvement");
        }
        sc.close();
    }
}
