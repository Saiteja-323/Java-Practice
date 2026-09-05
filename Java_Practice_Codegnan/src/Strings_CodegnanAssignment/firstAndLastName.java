package Strings_CodegnanAssignment;
import java.util.Scanner;
public class firstAndLastName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String FirstName = sc.nextLine();
		String SecondName = sc.nextLine();
		System.out.println(SecondName+","+FirstName.charAt(0));
		sc.close();
	}
	
}
