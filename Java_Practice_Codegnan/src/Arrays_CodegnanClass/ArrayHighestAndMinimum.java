package Arrays_CodegnanClass;
import java.util.Scanner;
public class ArrayHighestAndMinimum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max) max=arr[i];
			if(arr[i]<=min) min=arr[i];
		}
		System.out.println("maximum is: "+max);
		System.out.println("minimum is: "+min);
		sc.close();
	} 
}
