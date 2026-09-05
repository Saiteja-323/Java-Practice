package Basics_CgDSA_Class;
import java.util.*;
public class Merge2Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arr1 details:");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter arr2 details:");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0;i<n2;i++) {
			arr2[i] = sc.nextInt();
		}
		
		int[] res = new int[n1+n2];
		for(int i=0;i<res.length;i++) {
			if(i<n1) res[i] = arr1[i];
			else res[i]= arr2[(i)%(n2)];
		}
		Arrays.sort(res);
		System.out.println("The Combined Array is:");
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		sc.close();
	}
}
