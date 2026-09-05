package threads_CodegnanClass;
class Customer extends Thread {
    public void run() {
        synchronized (this) {
            System.out.println(getName() + " entered");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " finished");
        }
    }
}
public class RestrauntClassses {
    public static void main(String[] args) throws Exception {
        Customer c1 = new Customer();
        c1.setName("Saiteja");
        c1.start();
        Thread.sleep(2000);
        synchronized (c1) {
            c1.notify();
        }
    }
}