package encapsulation_CodegnanAssignment;
import java.util.Scanner;
class Fine{
    private int bookId;
    private int overdueDays;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getOverdueDays() {
		return overdueDays;
	}
	public void setOverdueDays(int overdueDays) {
		this.overdueDays = overdueDays;
	}
	public void setfineByDays() {
		this.overdueDays *= 5;
	}
	public void setfixedFine() {
		this.overdueDays = 10;
	}
	public void setfineByDaysPlusFixed() {
		this.overdueDays *=5;
		this.overdueDays +=10;
	}
}
public class LibraryFine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fine f=  new Fine();
        f.setBookId(sc.nextInt());
        sc.nextLine();
        f.setOverdueDays(sc.nextInt());
        sc.nextLine();
        f.setfineByDays();
        f.setfixedFine();
        f.setfineByDaysPlusFixed();
        System.out.println("bookID: "+f.getBookId());
        System.out.println("overdueDays: "+f.getOverdueDays());
        sc.close();
    }
}