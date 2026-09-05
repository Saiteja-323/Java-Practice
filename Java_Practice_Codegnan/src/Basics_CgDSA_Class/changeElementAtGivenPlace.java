package Basics_CgDSA_Class;
import java.util.Scanner;
public class changeElementAtGivenPlace {
    public static int[] changeAtPos(int k, int pos, int[] arr) {
        if (pos<0 || pos>arr.length) {
            System.out.println("Invalid position!");
            return arr;
        }
        for (int i=0; i<arr.length; i++) {
            if (i==pos) arr[i]=k;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array Length");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Enter no.of times to change the new Elements");
        int times = sc.nextInt();
        while (times>0) {
        	System.out.println("Enter number you want to put instead of Old:");
            int k = sc.nextInt();
            System.out.println("Enter the position:");
            int pos = sc.nextInt();
            arr = changeAtPos(k, pos, arr);
            for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
            System.out.println();
            times--;
        }
        sc.close();
    }
}