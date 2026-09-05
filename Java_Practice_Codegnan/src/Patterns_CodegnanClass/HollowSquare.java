package Patterns_CodegnanClass;
import java.util.Scanner;
public class HollowSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==1 || i==n) {
				for(int j=1;j<=n;j++) System.out.print("*");
			}
			else {
				for(int j=1;j<=n;j++) {
					if(j==1 || j==n) System.out.print("*");
					else System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
