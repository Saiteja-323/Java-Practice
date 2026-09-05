package ArraysDSA_Problems;
import java.util.*;
public class rotateRight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
		int k = sc.nextInt();
		k = k%n;
		System.out.println("Before ration");
		for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("after rotation");
		while(k!=0) {
			int temp = arr[n-1];
			for(int i=n-2;i>=0;i--) arr[i+1]=arr[i];
			arr[0] = temp;
			for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
			System.out.println();
			k--;
		}
		sc.close();
	}
}
