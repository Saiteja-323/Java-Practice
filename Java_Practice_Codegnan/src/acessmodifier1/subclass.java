package acessmodifier1;
public class subclass extends Main {
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.pub);
		System.out.println(m.pro);
		System.out.println(m.def);
		//System.out.println(m.d);
	}
}
