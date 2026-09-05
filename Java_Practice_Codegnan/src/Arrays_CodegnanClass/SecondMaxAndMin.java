package Arrays_CodegnanClass;
import java.util.Scanner;
public class SecondMaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int max2 = arr[0];
        int min = arr[0];
        int min2 = arr[0];
        for(int i=0;i<n;i++) {
            if(arr[i]>max) {
            	max2 = max;
                max = arr[i];
            }else if(arr[i]>max2 && arr[i]<max) {
                max2 = arr[i];
            }
            if (arr[i]<min) {
                min2 = min;
                min = arr[i];
            } else if (arr[i]< min2 && arr[i]>min) {
                min2 = arr[i];
            }
        }
        System.out.println("2nd max and min are:"+max2+" "+min2);
        sc.close();
    }
}