package Switch_CodegnanAssignment;
import java.util.Scanner;

public class GradeDescription {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade (A/B/C/D/F): ");
        char grade = sc.next().charAt(0);
        char lg = Character.toLowerCase(grade);
        switch (lg) {
            case 'a':
                System.out.println("Excellent");
                break;
            case 'b':
                System.out.println("Very Good");
                break;
            case 'c':
                System.out.println("Good");
                break;
            case 'd':
                System.out.println("Needs Improvement");
                break;
            case 'f':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid Grade");
        }
        sc.close();
    }
}
