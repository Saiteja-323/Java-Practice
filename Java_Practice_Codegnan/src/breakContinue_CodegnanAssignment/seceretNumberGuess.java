package breakContinue_CodegnanAssignment;
import java.util.*;
public class seceretNumberGuess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seceretNum = 25;
		while(true) {
			System.out.print("Guess the number: ");
			int n = sc.nextInt();
			if(n==seceretNum) { System.out.println("congrats"); break;}
			else System.out.println("Try Again");
		}
		sc.close();
	}

}
