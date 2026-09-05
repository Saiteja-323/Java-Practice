package IfElse_CodegnanClass;
import java.util.*;
public class secondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");		
		int b = sc.nextInt();
		System.out.print("Enter Third Number: ");		
		int c = sc.nextInt();
		System.out.println("the greatest number is below");
		if((a>b && a<c)||(a>c && a<b)) {
			System.out.println(a);
		}
		else if((b>a && b<c) || (b>c && b<a)) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		sc.close();
	}

}
