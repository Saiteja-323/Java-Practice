package loops_CodegnananClass;
import java.util.*;
public class factorial {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("which factorial do you want??: ");
	  int n = sc.nextInt();
	  int res = 1;
	  for(int i=1;i<=n;i++) {
		  res = res*i;
	  }
	  int ans = (n==0)?1:res;
	  System.out.println(n+" factroial is: "+ans);
	  sc.close();
	}
}
