package oops_CodegnanClass;
import java.util.*;
class Demo{
	public int generateNumber() {
		Random rm = new Random();
		int n = rm.nextInt(100)+1;
		return n;
	}
	public int sum(int a, int b) {
		return (a+b);
	}
	public static int diff(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		return (max-min);
	}
}
public class methodsDifferentCallingExamples {
	public void display() {
		System.out.println("welcome codegnan");
		display1();
	}
	public static void display1() {
		System.out.println("all the best for Students");
	}
	public static void main(String[] args) {
		methodsDifferentCallingExamples mdce = new methodsDifferentCallingExamples();
		display1();
		mdce.display();
		System.out.println();
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		int a = d1.generateNumber();
		int b = d2.generateNumber();
		System.out.println("Genereated 1st Number is: "+a);
		System.out.println("Genereated 2nd Number is: "+b);
		System.out.println("Sum of them is: "+d1.sum(a, b));
		System.out.println("difference between them: "+Demo.diff(a,b));
	}
}
