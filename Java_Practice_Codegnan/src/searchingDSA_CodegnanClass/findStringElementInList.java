package searchingDSA_CodegnanClass;
import java.util.*;
public class findStringElementInList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		list.add("Sai");
		list.add("teja");
		list.add("teja");
		String tar = "teja";
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(tar)) {
				System.out.println(tar+" elemnt found");
			}
		}
		sc.close();
	}
}
