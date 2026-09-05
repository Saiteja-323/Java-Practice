package codegnan_practise_sesson1;
import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> printed = new HashSet<>();
        int gnum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (seen.contains(num) && !printed.contains(num)) {
                printed.add(num);
            } else {
                seen.add(num);
            }
            gnum = num;
        }
        if(n==1) printed.add(gnum);
        System.out.println(printed);
        sc.close();
    }
}