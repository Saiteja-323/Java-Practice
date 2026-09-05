package Strings_CodegnanAssignment;
import java.util.*;
public class evenChangeOddReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] arr =  line.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) arr[i]=arr[i].toUpperCase();
			else {
				StringBuilder sb = new StringBuilder(arr[i]);
				arr[i]= sb.reverse().toString();
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
