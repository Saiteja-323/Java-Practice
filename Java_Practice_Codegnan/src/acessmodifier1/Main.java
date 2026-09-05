package acessmodifier1;
public class Main {
	public int pub = 10;
	protected int pro = 20;
	int def = 30;
	private int pri = 40;
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.pub);
		System.out.println(m.pro);
		System.out.println(m.def);
		System.out.println(m.pri);
	}
}
