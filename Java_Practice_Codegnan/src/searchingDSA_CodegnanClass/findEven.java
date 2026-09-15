package searchingDSA_CodegnanClass;
import java.util.*;
public class findEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) list.add(arr[i]);
		}
		System.out.println("even numbers in the list are:");
		System.out.println(list);
		sc.close();
	}
}
