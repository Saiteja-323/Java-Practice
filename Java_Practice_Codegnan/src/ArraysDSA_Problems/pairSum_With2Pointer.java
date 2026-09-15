package ArraysDSA_Problems;
import java.util.*;
public class pairSum_With2Pointer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int tar = sc.nextInt();
		List<List<Integer>> pairs = new ArrayList<>();
		int left = 0, right = n-1;
		while(left<right) {
			int sum = arr[left]+arr[right];
			if(sum>tar) right--;
			else if(sum<tar) left++;
			else {
				List<Integer> pair = new ArrayList<>();
				pair.add(arr[left]);
				pair.add(arr[right]);
				pairs.add(pair);
				left++;
				right--;
			}
		}
		System.out.println(pairs);
		sc.close();
	}
}
