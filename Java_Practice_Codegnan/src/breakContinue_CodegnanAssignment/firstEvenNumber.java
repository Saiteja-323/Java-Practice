package breakContinue_CodegnanAssignment;
import java.util.*;
public class firstEvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 3;
		//boolean isEvenThere = false;
		while(n!=0) {
			int num = sc.nextInt();
			if(num%2 == 0) {
				//isEvenThere = true;
				System.out.println("num: "+num);
				break;
			}
			n--;
		}
		if(n==0) System.out.println("No even number found");
		sc.close();
	}
}
