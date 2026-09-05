package Basics_CgDSA_Class;
import java.util.Scanner;
public class ArrayOperations {
    public static int doOPs(int option,int[] arr) {
    	int ans = 0;
    	switch(option) {
        case 1:
        	int sum = 0;
        	for(int i=0;i<arr.length;i++) sum+=arr[i];
        	ans = sum;
        	break;
        case 2:
        	int sum1 = 0;
        	for(int i=0;i<arr.length;i++) sum1+=arr[i];
        	int avg = (sum1/arr.length);
        	ans = avg;
        	break;
        case 3:
        	int max = 0;
        	for(int i=0;i<arr.length;i++) max = Math.max(arr[i], max);
        	ans = max;
        	break;
        case 4:
        	int min = 0;
        	for(int i=0;i<arr.length;i++) min = Math.min(arr[i], min);
        	ans = min;
        	break;
        default:
        	ans = -1;
        	break;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array Length");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Enter no.of times you want to do operations");
        int times = sc.nextInt();
        while (times>0) {
        	System.out.println("choose any option:");
        	System.out.println("OPtion1: sum of Array");
        	System.out.println("OPtion2: avg of Array");
        	System.out.println("OPtion3: max of Array");
        	System.out.println("OPtion4: min of Array");
            int option = sc.nextInt();
            int ans = doOPs(option,arr);
            System.out.println("answer is:"+ans);
            times--;
        }
        sc.close();
    }
}