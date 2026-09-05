package Strings_CodegnanAssignment;
import java.util.*;
public class matchesPrintElsePlus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine().toLowerCase();
		String line2 = sc.nextLine().toLowerCase();
		line1 = line1.replace(" ", "");
		for(int i=0;i<line1.length();i++) {
			char ch = line1.charAt(i);
			if(isPresent(ch,line2)) {
				System.out.print(ch);
			}
			else {
				System.out.print("+");
			}
		}
		sc.close();
	}
	public static boolean isPresent(char ch, String line) {
		for(int i=0;i<line.length();i++) {
			if(ch==line.charAt(i)) return true;
		}
		return false;
	}
}
