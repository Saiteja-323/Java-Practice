package ArraysDSA_Problems;
import java.util.*;
public class containerWithMostWater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int left = 0, right = n-1;
		int area = 0,maxArea = 0;
		while(left<right) {
			int width = Math.abs(left-right);
			int height = Math.max(left, right);
			area = width*height;
			maxArea = Math.max(maxArea, area);
			if(left>right) right--;
			else if(left<right) left++;
			else {
				left++;
				right--;
			}
		}
		for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
		sc.close();
	}
}
