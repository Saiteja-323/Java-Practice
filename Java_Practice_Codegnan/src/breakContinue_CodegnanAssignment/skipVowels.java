package breakContinue_CodegnanAssignment;
import java.util.*;
public class skipVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String newstr = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			char lch = Character.toLowerCase(ch);
			if(lch=='a' || lch=='e' || lch=='i' || lch=='o' || lch=='u') {
				continue;
			}
			newstr += String.valueOf(ch);
		}
		System.out.println("String without vowels are: "+newstr);
		sc.close();
	}

}
