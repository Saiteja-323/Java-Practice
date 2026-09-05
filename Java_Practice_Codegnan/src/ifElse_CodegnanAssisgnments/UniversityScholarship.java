package ifElse_CodegnanAssisgnments;
import java.util.Scanner;
public class UniversityScholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        if (cgpa >= 8.0 && attendance >= 75) {
            System.out.println("Scholarship Granted");
        } else if (cgpa >= 8.0 && attendance < 75) {
            System.out.println("Not eligible: Low attendance.");
        } else if (cgpa < 8.0 && attendance >= 75) {
            System.out.println("Not eligible: CGPA below requirement.");
        } else {
            System.out.println("Not eligible: Both CGPA and attendance below requirement.");
        }

        sc.close();
    }
}
