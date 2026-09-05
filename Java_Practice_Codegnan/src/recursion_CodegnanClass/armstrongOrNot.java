package recursion_CodegnanClass;
import java.util.Scanner;
public class armstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int len = 0;
        while (temp != 0) {
            len++;
            temp /= 10;
        }
        if (armstrong(n,n,0,len)) System.out.println(n+" is an Armstrong number.");
        else System.out.println(n+" is NOT an Armstrong number.");
        sc.close();
    }
    public static boolean armstrong(int original, int n, int sum, int len) {
        if (n==0) return sum==original;
        int digit = n%10;
        return armstrong(original, (n/10), sum+(int)Math.pow(digit,len), len);
    }
}