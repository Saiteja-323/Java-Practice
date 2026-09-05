package acessmodifier2;
public class subclass2 extends Main2 {
	public static void main(String[] args) {
		Main2 m2 = new Main2();
		subclass2 s2 = new subclass2();
		System.out.println(m2.pub);
		//System.out.println(m2.pro);
		System.out.println(s2.pro);
	}
}
