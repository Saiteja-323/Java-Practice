package loops_CodegnananClass;
import java.util.*;
public class ArmstrongOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number");
		int n = sc.nextInt();
		int given = n;
		int ans = 0;
		int rem = 0;
		while(n!=0) {
			rem = n%10;
			ans += rem*rem*rem;
			n = n/10;
		}
		if(given==ans) System.out.println("armstrong");
		else System.out.println("not armstrong");
		sc.close();
	}
}
