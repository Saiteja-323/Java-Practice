package searchingDSA_CodegnanClass;
import java.util.*;
public class binarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		int tar = sc.nextInt();
		int ind = -1;
		int left = 0, right = n-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]==tar) {
				ind = mid;
				break;
			}
			else if(arr[mid]<tar) {
				left = mid+1;
			}
			else {
				right= mid-1;
			}
		}
		if(ind==-1) System.out.println("element not found");
		else System.out.println("element is in index"+ind);
		sc.close();
	}
}
