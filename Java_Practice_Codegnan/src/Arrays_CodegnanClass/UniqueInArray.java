package Arrays_CodegnanClass;
import java.util.Scanner;
public class UniqueInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			boolean nrepeating = true;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					nrepeating = false;
					break;
				}
			}
			if(nrepeating) System.out.println(arr[i]);
		}
		sc.close();
	} 
}
