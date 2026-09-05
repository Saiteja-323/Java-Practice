package Basics_CgDSA_Class;
import java.util.Arrays;
import java.util.Scanner;
public class findingMajorityElement {
    public static int majorElem(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) count++;
            else count = 1;
            if (count > arr.length / 2) return arr[i];
        }
        if (arr.length == 1) return arr[0];
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Length:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int major = majorElem(arr);
        if (major != -1) System.out.println(major + " is Majority Element");
        else System.out.println("No Majority Element");
        sc.close();
    }
}