package IfElse_CodegnanClass;
import java.util.*;
public class firstLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: ");
		int n = sc.nextInt();
		System.out.println("enter second number: ");
		int n2 = sc.nextInt();
		System.out.println("enter third number: ");
		int n3 = sc.nextInt();
		
		if(n<n2 && n2<n3) {
			System.out.println(n3);
		}
		else if (n3<n2) {
			System.out.println(n2);
		}
		else {
			System.out.println(n);
		}
		sc.close();
	}
}
