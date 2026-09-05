package oops_CodegnanClass;
public class constructorExample {
	int age;
	String name;
	public constructorExample(){
		age = 23;
		name = "rama";
	}
	public constructorExample(int sage,String sname) {
		age = sage;
		name = sname;
	}
	public void display() {
		System.out.println("age: "+age);
		System.out.println("name: "+name);
		System.out.println();
	}
	public static void main(String[] args) {
		constructorExample s1 = new constructorExample();
		System.out.println("s1 object detail");
		s1.display();
		constructorExample s2 = new constructorExample(23,"saiteja");
		System.out.println("s2 object detail");
		s2.display();
		constructorExample s3 = new constructorExample(36,"naidu");
		System.out.println("s3 object detail");
		s3.display();
	}
}
