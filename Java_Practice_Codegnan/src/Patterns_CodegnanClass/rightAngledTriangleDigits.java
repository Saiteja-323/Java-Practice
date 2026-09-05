package Patterns_CodegnanClass;
import java.util.*;
public class rightAngledTriangleDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int j = 0;
		for(int i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
