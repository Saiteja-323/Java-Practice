package oops_CodegnanAssignment;
class Mobile_AllConstructorExample {
    int id;
    String brand;
    String model;
    double price;
    Mobile_AllConstructorExample() {
        id = 1001;
        brand = "Samsung";
        model = "Galaxy A35";
        price = 28000.0;
    }
    Mobile_AllConstructorExample(int id, String brand, String model, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    Mobile_AllConstructorExample(Mobile_AllConstructorExample m) {
        this.id = m.id;
        this.brand = m.brand;
        this.model = m.model;
        this.price = m.price;
    }
    void display() {
        System.out.println("Mobile ID : " + id);
        System.out.println("Brand     : " + brand);
        System.out.println("Model     : " + model);
        System.out.println("Price     : " + price);
        System.out.println();
    }
    public static void main(String[] args) {
        Mobile_AllConstructorExample m1 = new Mobile_AllConstructorExample();
        Mobile_AllConstructorExample m2 = new Mobile_AllConstructorExample(1002, "OnePlus", "Nord CE 5", 24999.0);
        Mobile_AllConstructorExample m3 = new Mobile_AllConstructorExample(m2);
        System.out.println("Mobile 1 (Default Constructor)");
        m1.display();
        System.out.println("Mobile 2 (Parameterized Constructor)");
        m2.display();
        System.out.println("Mobile 3 (Copy Constructor)");
        m3.display();
        m3.price = 21999.0;
        System.out.println("After changing Mobile 3 price:");
        System.out.println("Mobile 2 Details:");
        m2.display();
        System.out.println("Mobile 3 Details:");
        m3.display();
    }
}