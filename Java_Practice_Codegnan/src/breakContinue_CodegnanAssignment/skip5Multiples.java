package breakContinue_CodegnanAssignment;
import java.util.*;
public class skip5Multiples {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%5==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
