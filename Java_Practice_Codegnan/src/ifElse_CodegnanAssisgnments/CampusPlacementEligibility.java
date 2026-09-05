package ifElse_CodegnanAssisgnments;
import java.util.Scanner;

public class CampusPlacementEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter number of backlogs: ");
        int backlogs = sc.nextInt();

        System.out.print("Enter communication score (0–10): ");
        double communication = sc.nextDouble();

        System.out.print("Enter aptitude score (0–10): ");
        double aptitude = sc.nextDouble();

        if (backlogs > 0) {
            System.out.println("Not Eligible (has backlogs)");
        } else {
            if (cgpa >= 7.0) {
                if (communication >= 7.0 && aptitude >= 7.0) {
                    System.out.println("Eligible for Placement");
                } else {
                    System.out.println("Eligible for Written Test Only");
                }
            } else {
                System.out.println("Not Eligible (CGPA below requirement)");
            }
        }

        sc.close();
    }
}