package Basics_CgDSA_Class;
import java.util.*;
public class findDuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0;i<n;i++) {
			set.add(arr[i]);
		}
		boolean found = false;
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				found = true;
				System.out.println(arr[i]);
				break;
			}
		}
		if(found==false) System.out.println("no duplicate");
		System.out.println(set);
		sc.close();
	}
}
