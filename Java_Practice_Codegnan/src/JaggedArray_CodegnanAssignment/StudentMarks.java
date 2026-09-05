package JaggedArray_CodegnanAssignment;
import java.util.*;
public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no.of Students: ");
		int n = sc.nextInt();
		int[][] arr = new int[n][];
		for(int i=0;i<n;i++) {
			System.out.print("How many subjects for student"+(i+1)+": ");
			int m = sc.nextInt();
			arr[i] = new int[m];
			for(int j=0;j<m;j++) {
				System.out.print("student"+(i+1)+" subject"+(j+1)+": ");
				int score = sc.nextInt();
				arr[i][j]= score;
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
