package collections_CodegnanClass;
import java.util.*;
public class GroupAnagramPairs_HashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) arr[i]=sc.next();
		HashMap<String,List<String>> map = new HashMap<>();
		List<List<String>> pairs = new ArrayList<>();
		for(String str: arr) {
			char[] carr = str.toCharArray();
			Arrays.sort(carr);
			String newStr = carr.toString();
			if(map.containsKey(newStr)) map.get(newStr).add(str);
			else {
				List<String> pair = new ArrayList<>();
				pair.add(str);
				map.put(newStr, pair);
			}
		}
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
		    pairs.add(entry.getValue());
		}
		System.out.println(pairs);
		sc.close();
	}
}
