package loops_CodegnananClass;
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		int given = n;
		int sum = 0;
		int rem = 0;
		while(n!=0) {
			rem = n%10;
			sum = sum + rem;
			n = n/10;
		}
		System.out.println("Sum of Didgits of "+given+" is: "+sum);
		sc.close();
	}
}
