package codegnan_practise_sesson1;
import java.util.*;
public class non_repeating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> printed = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (seen.contains(num) && !printed.contains(num)) {
                printed.add(num);
            } else {
                seen.add(num);
            }
        } 
        for(int num:printed) {
        	seen.remove(num);
        }
        System.out.print(seen);
        sc.close();
	}
}
