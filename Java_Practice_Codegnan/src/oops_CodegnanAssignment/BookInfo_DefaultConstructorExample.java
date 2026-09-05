package oops_CodegnanAssignment;
public class BookInfo_DefaultConstructorExample {
	int bookId;
	String title;
	String author;
	int price;
	public BookInfo_DefaultConstructorExample(){
		bookId = 23;
		title = "Java Programming";
		author = "James Gosling";
		price = 650;
	}
	
	public void display() {
		System.out.println("bookId: "+bookId);
		System.out.println("title: "+title);
		System.out.println("author: "+author);
		System.out.println("price: "+price);
		System.out.println();
	}
	public static void main(String[] args) {
		BookInfo_DefaultConstructorExample s1 = new BookInfo_DefaultConstructorExample();
		System.out.println("s1 object detail");
		s1.display();
	}
}
