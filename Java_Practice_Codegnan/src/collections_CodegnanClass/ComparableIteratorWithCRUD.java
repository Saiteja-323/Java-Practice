package collections_CodegnanClass;
import java.util.*;
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    Student(int id, String name, int age) { this.id = id; this.name = name;this.age = age;}
    public int getId() { return id;}
    public String getName() {return name;}
    public int getAge() {return age;}
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    @Override
    public int compareTo(Student s) { return Integer.compare(this.age, s.age);}
    @Override
    public String toString() {return id + " " + name + " " + age;}
}

public class ComparableIteratorWithCRUD {
    static List<Student> slist = new ArrayList<>();
    public static void addStudent(Student s) {
        slist.add(s);
        System.out.println("Student added successfully!");
    }
    public static void displayStudents() {
        if (slist.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : slist) System.out.println(s);
    }
    public static void updateStudent(int id, String name, int age) {
        for (Student s : slist) {
            if (s.getId() == id) {
                s.setName(name);
                s.setAge(age);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public static void deleteStudent(int id) {
        Iterator<Student> itr = slist.iterator();
        while (itr.hasNext()) {
            Student s = itr.next();
            if (s.getId() == id) {
                itr.remove();
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public static void main(String[] args) {
        addStudent(new Student(1, "Saiteja", 21));
        addStudent(new Student(2, "Nikhil", 22));
        addStudent(new Student(3, "Bharath", 23));
        System.out.println("\nStudents:");
        displayStudents();
        System.out.println("\nUpdating student with ID 2:");
        updateStudent(2, "Nikhil Kumar", 25);
        System.out.println("\nStudents after update:");
        displayStudents();
        System.out.println("\nDeleting student with ID 1:");
        deleteStudent(1);
        System.out.println("\nStudents after delete:");
        displayStudents();
        Collections.sort(slist);
        System.out.println("\nStudents sorted by age:");
        displayStudents();
    }
}