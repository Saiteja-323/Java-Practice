package encapsulation_CodegnanAssignment;
import java.util.Scanner;
class Car{
    private String model;
    private String year;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
}
public class CarRentalSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c=  new Car();
        c.setModel(sc.nextLine());
        c.setYear(sc.nextLine());
        System.out.println("model: "+c.getModel());
        System.out.println("Year: "+c.getYear());
        sc.close();
    }
}