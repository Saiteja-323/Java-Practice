package ArraysDSA_Problems;
import java.util.*;
public class zerosAndNonZeros {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) arr[i]=sc.nextInt();
			int fast = 0,slow = 0;
			for(fast=0;fast<n;fast++){
				int temp = arr[fast];
				arr[fast] = arr[slow];
				arr[slow] = temp;
				slow++;
			}
			for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
			sc.close();
		}
	}
}
