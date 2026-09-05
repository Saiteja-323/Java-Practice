package Arrays_CodegnanClass;
import java.util.*;
public class StonePaperScissorGame {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("YO! Welcome Dude. Let's Strat the Game!");
		System.out.println();
		System.out.println("1.Rock");
		System.out.println("2.Paper");
		System.out.println("3.Scissors");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		int pchoice = random.nextInt(3)+1;
		System.out.println();
		System.out.print("Your choice is: ");
		if(choice ==1) {
			System.out.println("1.Rock");
		}else if(choice==2) {
			System.out.println("2.Paper");
		}else if(choice==3) {
			System.out.println("3.Scissors");
		}else {
			System.out.println("Invalid Input ra labbe.");
			return;
		}
		System.out.print("PC choice: ");
		if(pchoice ==1) {
			System.out.println("1.Rock");
		}else if(pchoice ==2) {
			System.out.println("2.Paper");
		}else {
			System.out.println("3.Scissors");
		}
		System.out.println();
		if(choice ==pchoice) {
			System.out.println("Draw ra labbe.");
		}else if((choice ==1 && pchoice==3)|| (choice==2 && pchoice==1)||(choice==3 && pchoice==2)) {
			System.out.println("U Win");
		}else {
			System.out.println("Computer Win.");
		}
		sc.close();
	}
}
