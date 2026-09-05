package recursion_CodegnanClass;
import java.util.Scanner;
public class SumOf1toNdigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number: ");
		int n = sc.nextInt();
		int ans1 = sumInRec(n);
		int ans2 = sumInIte(n);
		System.out.println(n+" Sum of Digits upto n in recursive is: "+ans1);
		System.out.println(n+" Sum of Digits upto n in iterative is: "+ans2);
		sc.close();
	}
	public static int sumInRec(int n) {
		if(n==1 || n==0) return n;
		else return n+sumInRec(n-1);
	}
	public static int sumInIte(int n) {
		return (n*(n+1))/2;
	}
}
