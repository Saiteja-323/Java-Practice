package oops_CodegnanClass;
public class ObjectCreation_With_Static_InstanceBlocks {
    String name;
    int age;
    int rollno;
    static String institute = "Codegnan";
    static {
    	System.out.println("About All Students");
    	System.out.println();
    }
    {
    	System.out.println("Student info");
    	System.out.println();
    }
	public static void main(String[] args) {
		ObjectCreation_With_Static_InstanceBlocks stu1 = new ObjectCreation_With_Static_InstanceBlocks();
		stu1.name = "Saiteja";
		stu1.age = 21;
		stu1.rollno = 54;
		System.out.println("Stu1 adress: "+stu1);
		System.out.println("Stu1 name: "+stu1.name+" stu1 age: "+stu1.age+" stu1.rollno: "+stu1.rollno);
		System.out.println();
		
		ObjectCreation_With_Static_InstanceBlocks stu2 = new ObjectCreation_With_Static_InstanceBlocks();
		stu2.name = "Bharath";
		stu2.age = 21;
		stu2.rollno = 35;
		System.out.println("Stu2 adress: "+stu2);
		System.out.println("Stu2 name: "+stu2.name+" stu1 age: "+stu2.age+" stu1.rollno: "+stu2.rollno);
		System.out.println();
		
		System.out.println("stu1.institute: "+institute+" stu2.institute: "+institute);
	}

}
