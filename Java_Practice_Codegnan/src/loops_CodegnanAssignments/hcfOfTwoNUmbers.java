package loops_CodegnanAssignments;
import java.util.*;
public class hcfOfTwoNUmbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number1: ");
		int a = sc.nextInt();
		System.out.print("Enter a number2: ");
		int b = sc.nextInt();
		int min = Math.min(a, b);
		int max = 0;
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0) max=Math.max(max, i);
		}
		System.out.println("hcf of "+a+" and "+b+" is: "+max);
		sc.close();
	}
}
