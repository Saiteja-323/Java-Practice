package recursion_CodegnanClass;
import java.util.*;
public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number: ");
		int n = sc.nextInt();
		int ans = fact(n);
		System.out.println(n+" factorial is: "+ans);
		sc.close();
	}
	public static int fact(int n) {
		if(n==1 || n==0) return 1;
		else return n*fact(n-1);
	}
}
