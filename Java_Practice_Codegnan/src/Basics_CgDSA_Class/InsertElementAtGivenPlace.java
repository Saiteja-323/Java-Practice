package Basics_CgDSA_Class;
import java.util.Scanner;
public class InsertElementAtGivenPlace {
    public static int[] insertAtPos(int k, int pos, int[] arr) {
        if (pos<0 || pos>arr.length) {
            System.out.println("Invalid position!");
            return arr;
        }
        int[] res = new int[arr.length + 1];
        for (int i=0; i<res.length; i++) {
            if (i<pos) res[i]=arr[i];
            else if (i==pos) res[i]=k;
            else res[i]=arr[i - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array Length");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Enter no.of times to insert the new Elements");
        int times = sc.nextInt();
        while (times > 0) {
        	System.out.println("Enter number you want to Insert:");
            int k = sc.nextInt();
            System.out.println("Enter the position:");
            int pos = sc.nextInt();
            arr = insertAtPos(k, pos, arr);
            for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
            System.out.println();
            times--;
        }
        sc.close();
    }
}