package oops_CodegnanClass;
import java.util.Scanner;
class Fruit {
    String name;
    int price;
    Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
    static Fruit[] farr = new Fruit[3];
    static void addFruitAtIndex(int index, String name, int price) {
        if (index >= 0 && index < farr.length) {
            farr[index] = new Fruit(name, price);
        } else {
            System.out.println("Invalid Index");
        }
    }
    static void displayAllFruits() {
        for (int i = 0; i < farr.length; i++) {
            if (farr[i] != null) {
                System.out.println("Fruit " + i + " : " + farr[i].name + " Price : " + farr[i].price);
            } else {
                System.out.println("Fruit " + i + " : Empty");
            }
        }
    }
    static void getFruit(int index) {
        if (index >= 0 && index < farr.length && farr[index] != null) {
            System.out.println("Fruit : " + farr[index].name + " Price : " + farr[index].price);
        } else {
            System.out.println("Fruit not found.");
        }
    }
}

public class ObjectArrayCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Add Fruit");
            System.out.println("2. Display All Fruits");
            System.out.println("3. Get Fruit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter Index: ");
                int index = sc.nextInt();
                System.out.print("Enter Fruit Name: ");
                String fruitName = sc.next();
                System.out.print("Enter Fruit Price: ");
                int fruitPrice = sc.nextInt();
                Fruit.addFruitAtIndex(index, fruitName, fruitPrice);
                System.out.println("Fruit Added Successfully.");
                break;

            case 2:
                Fruit.displayAllFruits();
                break;

            case 3:
                System.out.print("Enter Index: ");
                index = sc.nextInt();
                Fruit.getFruit(index);
                break;

            case 4:
                exit = true;
                System.out.println("exited sucesssfully");
                break;

            default:
                System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}