package Strings_CodegnanAssignment;
import java.util.Scanner;
public class PrintExtension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine().replace(" ","");
        int index = fileName.lastIndexOf('.');
        if (index!=-1 && index!=fileName.length()-1){
            System.out.println(fileName.substring(index+1));
        } else {
            System.out.println("No extension");
        }
        sc.close();
    }
}
