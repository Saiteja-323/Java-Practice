package Switch_CodegnanAssignment;
import java.util.Scanner;
public class FoodOrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== MENU =====");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Sandwich");
        System.out.println("4. Biryani");
        System.out.println("5. Coffee");
        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Pizza: ₹250");
                break;
            case 2:
                System.out.println("Burger: ₹120");
                break;
            case 3:
                System.out.println("Sandwich: ₹90");
                break;
            case 4:
                System.out.println("Biryani: ₹200");
                break;
            case 5:
                System.out.println("Coffee: ₹60");
                break;
            default:
                System.out.println("Item Not Available");
        }
        sc.close();
    }
}