package encapsulation_CodegnanAssignment;
import java.util.*;
class Recharge {
    private String mobile;
    private String operator;
    private double amount;
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        if (mobile.matches("\\d{10}")) {
            this.mobile = mobile;
        }
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        if (amount >= 10) {
            this.amount = amount;
        }
    }
}

public class mobileRechargeSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Recharge r = new Recharge();
        r.setMobile(sc.next());
        sc.nextLine();
        r.setOperator(sc.nextLine());
        r.setAmount(sc.nextDouble());
        System.out.println(r.getMobile());
        System.out.println(r.getOperator());
        System.out.println(r.getAmount());
        sc.close();
    }
}