package Basics_CgDSA_Class;
import java.util.*;
public class isPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int left = 0, right = str.length()-1;
		boolean isPalin = true;
		while(left<=right) {
			if(str.charAt(left)!=str.charAt(right)) {
				isPalin = false;
				break;
			}
			left++;
			right--;
		}
		System.out.println(isPalin);
		sc.close();
	}
}
