package codegnan_practise_sesson1;
import java.util.*;
public class PairOfElemSumEqualTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        int[][] pairs=getPairs(arr,target);
        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]==Integer.MIN_VALUE)
                break;
            System.out.println(pairs[i][0]+" "+pairs[i][1]);
        }
        sc.close();
    }
    public static int[][] getPairs(int[] arr,int target){
        int[][] pairs=new int[arr.length][2];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    pairs[k][0]=arr[i];
                    pairs[k][1]=arr[j];
                    k++;
                }
            }
        }
        for(int i=k;i<pairs.length;i++){
            pairs[i][0]=Integer.MIN_VALUE;
        }
        return pairs;
    }
}