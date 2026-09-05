package Arrays_CodegnanAssignment;
import java.util.Scanner;
public class PrintPrimeNumbersPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(isPrime(arr[i])) System.out.print(i+" ");
		}
		sc.close();
	}
	public static boolean isPrime(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) count++;
		}
		if(count>2) return false;
		else return true;
	}
}