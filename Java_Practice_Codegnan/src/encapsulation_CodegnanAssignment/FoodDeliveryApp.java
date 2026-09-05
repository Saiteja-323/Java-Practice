package encapsulation_CodegnanAssignment;
import java.util.*;
class Order {
    private int id;
    private String name;
    private double amount;
    private String status;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        }
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        if (status.equals("Pending") || status.equals("Preparing") || status.equals("Delivered") || status.equals("Cancelled")) {
            this.status = status;
        }
    }
}
public class FoodDeliveryApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order o = new Order();
        o.setId(sc.nextInt());
        sc.nextLine();
        o.setName(sc.nextLine());
        o.setAmount(sc.nextDouble());
        sc.nextLine();
        o.setStatus(sc.nextLine());
        System.out.println(o.getId());
        System.out.println(o.getName());
        System.out.println(o.getAmount());
        System.out.println(o.getStatus());
        sc.close();
    }
}