package loops_CodegnananClass;
import java.util.*;
public class palindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENter a NUmber: ");
		int n = sc.nextInt();
		int given = n;
		int rev = 0;
		int rem = 0;
		while(n!=0) {
			rem = n%10;
			rev = (rev*10)+ rem;
			n = n/10;
		}
		if(rev==given) {
			System.out.println(given+" is a Palindrome number");
		}
		else {
			System.out.println(given+" is not palindrome");
		}
		sc.close();
	}
}
