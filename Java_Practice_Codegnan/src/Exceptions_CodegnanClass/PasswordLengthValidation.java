package Exceptions_CodegnanClass;
import java.util.Scanner;
@SuppressWarnings("serial")
class InvalidLength extends Exception{
    public InvalidLength(String msg){
        super(msg);
    }
}
public class PasswordLengthValidation {
    public static void checkLength(String password) throws InvalidLength {
        if (password.length() < 8) {
            throw new InvalidLength("Password has invalid length. It must be at least 8 characters.");
        } else {
            System.out.println("Password is valid.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        try {
            checkLength(password);
        } catch (InvalidLength e) {
            e.printStackTrace();
        }
        System.out.println("Program Completed");
        sc.close();
    }
}