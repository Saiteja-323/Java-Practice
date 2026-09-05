package collections_CodegnanClass;
import java.util.*;
public class list {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("SaiTeja");
		l.add("Bharath");
		l.add("Guru");
		l.add("devi");
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if(name.contains("a")) {
				it.remove();
			}
		}
		System.out.println(l);
	}
}
