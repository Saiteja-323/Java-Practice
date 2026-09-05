package oops_CodegnanClass;
public class thisAndSuperExample {
	int age;
	String name;
	int rank;
	public thisAndSuperExample(int age,String name) {
		this.age = age;
		this.name = name;
	}
	public thisAndSuperExample(int age,String name,int rank) {
		this(age,name); //Constructor Calling
		this.rank = rank;
	}
	void display() {
		if(rank==0) System.out.println("name:"+name+" age:"+age);
		else System.out.println("name:"+name+" age:"+age+" rank:"+rank);
		System.out.println();
	}
	public static void main(String[] args) {
		thisAndSuperExample student1 = new thisAndSuperExample(23,"ram");
		thisAndSuperExample student3 = new thisAndSuperExample(25,"bharath");
		student1 = student3; //original student1 object (which is in heap memory) goes to garbage collector 
		student1.display();
		thisAndSuperExample student2 = new thisAndSuperExample(25,"saiteja",1);
		student2.display();
	}
}
