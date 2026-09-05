package loops_CodegnananClass;
import java.util.*;
public class reverseNumber {
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
		System.out.println(given+" Reverse is: "+rev);
		sc.close();
	}

}
