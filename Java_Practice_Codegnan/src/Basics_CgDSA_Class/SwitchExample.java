package Basics_CgDSA_Class;
import java.util.Scanner;
public class SwitchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n){
		case 1:
			System.out.println("Veg Biriyani --- 170/-");
			break;
		case 2:
			System.out.println("Pizza --- 290/-");
			break;
		case 3:
			System.out.println("Chiken Dum Biriyani --- 340/-");
			break;
		case 4:
			System.out.println("Burger --- 140/-");
			break;
		case 5:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Out of Stock");
			break;
		}
		sc.close();
	}
}
