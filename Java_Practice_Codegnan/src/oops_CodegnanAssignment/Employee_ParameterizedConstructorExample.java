package oops_CodegnanAssignment;
class Employee_ParameterizedConstructorExample {
    int id;
    String name;
    String dept;
    double sal;

    Employee_ParameterizedConstructorExample(int id, String name, String dept, double sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + dept);
        System.out.println("Salary      : " + sal);
        System.out.println();
    }
    public static void main(String[] args) {
    	Employee_ParameterizedConstructorExample e1 = new Employee_ParameterizedConstructorExample(101, "Ravi", "HR", 35000);
    	Employee_ParameterizedConstructorExample e2 = new Employee_ParameterizedConstructorExample(102, "Priya", "Developer", 55000);
    	Employee_ParameterizedConstructorExample e3 = new Employee_ParameterizedConstructorExample(103, "Kiran", "Testing", 42000);

        e1.display();
        e2.display();
        e3.display();
    }
}