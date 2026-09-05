package switchCase_CodegnanClass;
import java.util.*;
public class Caluclator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which operation you want: ");
		char symbol = sc.next().charAt(0);
		System.out.println("Enter 1st Operand Value: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Operand Value");
		int b = sc.nextInt();
		int ans = 0;
		switch(symbol) {
		case '+':{ 
					ans = a+b;
					System.out.println(a+" + "+b+"="+ans);
					break;
				}
		case '-':{ 
					ans = a+b;
					System.out.println(a+" - "+b+"="+ans);
					break;
				}
		case '*':{ 
					ans = a+b;
					System.out.println(a+" * "+b+"="+ans);
					break;
				}
		case '/':{ 
					ans = a+b;
					System.out.println(a+" / "+b+"="+ans);
					break;
				}
		case '%': { 
					ans = a+b;
					System.out.println(a+" % "+b+"="+ans);
					break;
		}
		default:System.out.println("Enter wrong Symbol");
				break;
		}
		sc.close();
	}
}
