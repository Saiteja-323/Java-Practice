package interfaceDSA;
interface mom{
	default void sleep() {
		System.out.println("sleep left");
	}
}
interface dad{
	static void sleep() {
		System.out.println("sleep right");
	}
}
class baby implements mom,dad{
	@Override
	public void sleep() {
		System.out.println("i can sleep in my own");
		mom.super.sleep();
		dad.sleep();
	}
}
public class interfaces{
	public static void main(String[] args) {
		baby b = new baby();
		b.sleep();
	}
}
