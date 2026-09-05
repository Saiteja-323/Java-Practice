package Strings_CodegnanAssignment;
import java.util.Scanner;
public class evenIndexArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] arr =  line.split(" ");
		String[] ans = new String[(arr.length)/2];
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) ans[count++] = arr[i];
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		sc.close();
	}
}

