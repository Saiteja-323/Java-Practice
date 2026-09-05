package Basics_CgDSA_Class;
import java.util.Arrays;
import java.util.Scanner;
public class findingMissingElement {
    public static int missedElem(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]+1) return arr[i-1]+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Length:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int missed = missedElem(arr);
        if (missed != -1) System.out.println(missed + " is Missed Element");
        else System.out.println("No Missed Element");
        sc.close();
    }
}