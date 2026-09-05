package codegnan_practise_sesson1;
import java.util.*;
public class CommonIn2arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st array");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++) arr1[i]=sc.nextInt();
        System.out.println("Enter 2nd array");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++) arr2[i]=sc.nextInt();
        System.out.println("Common elements are:");
        for(int i=0;i<n1;i++){
            boolean printed=false;
            for(int k=0;k<i;k++){
                if(arr1[i]==arr1[k]){
                    printed=true;
                    break;
                }
            }
            if(printed) continue;
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
        sc.close();
    }
}