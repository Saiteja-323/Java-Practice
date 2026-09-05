package loops_CodegnanAssignments;
import java.util.*;
public class MagicNUmber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int ans = n;
		while(ans >= 10) {
			ans = Sum(ans);
			System.out.println(ans);
		}
		if(ans==1) System.out.println("it is magic number");
		else System.out.println("not magic number");
		sc.close();
	}
	public static int Sum(int n) {
		int rem = 0;
		int ans = 0;
		while(n!=0) {
			rem = n%10;
			ans = ans + rem;
			n = n/10;
		}
		return ans;
	}
}
