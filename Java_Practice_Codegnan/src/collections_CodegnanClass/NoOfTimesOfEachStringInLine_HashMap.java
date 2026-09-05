package collections_CodegnanClass;
import java.util.*;
public class NoOfTimesOfEachStringInLine_HashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<String,Integer> map = new HashMap<>();
		for(String s:str.split(" ")) {
			map.put(s,map.getOrDefault(s,0)+1);
		}
		System.out.println(map);
		sc.close();
	}
}
