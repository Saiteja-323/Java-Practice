package JaggedArray_CodegnanAssignment;
import java.util.*;
public class EachRowSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no.of rows: ");
		int n = sc.nextInt();
		int[][] arr = new int[n][];
		for(int i=0;i<n;i++) {
			System.out.print("How many nums for row"+(i+1)+": ");
			int m = sc.nextInt();
			arr[i] = new int[m];
			for(int j=0;j<m;j++) {
				System.out.print("row"+(i+1)+" num"+(j+1)+" value: ");
				int val = sc.nextInt();
				arr[i][j]= val;
			}
			System.out.println();
		}
		
		int totalsum = 0;
		int[] sum = new int[n];
		System.out.println("-----------Output-----------");
		System.out.println("Printing All elements:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				sum[i] += arr[i][j];
			}
			totalsum += sum[i];
			System.out.println();
		}
		System.out.println("Printing row Sums:");
		for(int i=0;i<n;i++) {
			System.out.println("row"+(i+1)+" sum: "+sum[i]);
		}
		System.out.println();
		System.out.println("TotalSum: "+totalsum);
		sc.close();
	}

}
