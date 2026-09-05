package String_CodegnanClass;
public class Strings {
	public static void main(String[] args) {
		String s = "maAm mam";
		
		char[] sarr = s.replace(" ","").toLowerCase().toCharArray();
		String ans = "";
		for(int i=0;i<sarr.length;i++) {
			if(sarr[i]=='a' ||sarr[i]=='e'||sarr[i]=='i' ||sarr[i]=='o'||sarr[i]=='u') {
				ans += String.valueOf(sarr[i]);
			}
		}
		boolean checkpalindrome = isPalindrome(ans);
		int wordCount = noOfWords(s);
		System.out.println(ans);
		System.out.println(checkpalindrome);
		System.out.println(wordCount);
	}
	public static boolean isPalindrome(String s) {
		boolean check = false;
		for(int i=0;i<s.length()/2; i++) {
			if(s.charAt(i)==s.charAt(s.length()-1-i)) check=true;
			else check= false;
		}
		return check;
	}
	public static int noOfWords(String s) {
		String[] arr = s.split(" ");
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		return count;
	}
}
