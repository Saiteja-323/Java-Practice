package breakContinue_CodegnanAssignment;
import java.util.*;
public class negitiveNumberStop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();	
			if(n<0) {
				System.out.println("Program Ended");
				break;
			}
		}
		sc.close();
	}
}
