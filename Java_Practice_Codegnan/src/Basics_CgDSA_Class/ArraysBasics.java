package Basics_CgDSA_Class;
import java.util.*;
public class ArraysBasics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<arr1.length;i++) arr1[i]=sc.nextInt();
		for(int i=0;i<arr1.length;i++) System.out.print(arr1[i]+" ");
		System.out.println();
		int[] arr2 = null;
		System.out.println(arr2);
		int[] arr3 = {1,2,3,4};
		for(int i=0;i<arr3.length;i++) System.out.print(arr3[i]+" ");
		sc.close();
	}
}
