package codegnan_practise_sesson1;
import java.util.*;
public class maxDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int diff = 0;
		int max = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				diff = Math.abs(arr[j]-arr[i]);
				max = Math.max(max, diff);
			}
		}
		System.out.println(max);
		sc.close();
	}
}
