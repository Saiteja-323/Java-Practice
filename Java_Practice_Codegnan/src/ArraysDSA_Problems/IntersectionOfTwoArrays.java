package ArraysDSA_Problems;
import java.util.*;
public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i=0;i<a.length;i++) a[i] = sc.nextInt();
		for(int i=0;i<b.length;i++) b[i] = sc.nextInt();
		HashSet<Integer> setA = new HashSet<>();
		HashSet<Integer> setB = new HashSet<>();
		for(int i=0;i<a.length;i++) setA.add(a[i]);
		for(int i=0;i<b.length;i++) setB.add(b[i]);
		for(int num:setA) {
			if(setB.contains(num)) System.out.println(num);
		}
		sc.close();
	}
}
