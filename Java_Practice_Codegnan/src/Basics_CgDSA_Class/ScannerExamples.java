package Basics_CgDSA_Class;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class ScannerExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeId = 0;
        String employeeName = "";
        String fatherName = "";
        char gender = ' ';
        char maritalStatus = ' ';
        byte age = 0;
        BigDecimal salary = BigDecimal.ZERO;
        BigDecimal annualSalary = BigDecimal.ZERO;
        BigDecimal bonus = BigDecimal.ZERO;
        String address = "";
        String department = "";
        String email = "";
        String phoneNumber = "";
        int atmPin = 0;
        float height = 0.0f;
        byte experience = 0;
        BigInteger aadhaarNumber = BigInteger.ZERO;

        System.out.print("Enter Employee ID: ");
        if (sc.hasNextInt()) {
            employeeId = sc.nextInt();
            if (employeeId < 0 || employeeId > 999999) {
                System.out.println("Employee ID must be between 1000 and 999999.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid Employee ID.");
            sc.close();
            return;
        }
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine().trim();
        if (employeeName.length() < 2 || employeeName.length() > 50) {
            System.out.println("Name must contain 2 to 50 characters.");
            sc.close();
            return;
        }

        System.out.print("Enter Father's Name: ");
        fatherName = sc.nextLine().trim();
        if (fatherName.length() < 2 || fatherName.length() > 50) {
            System.out.println("Father's Name must contain 2 to 50 characters.");
            sc.close();
            return;
        }

        System.out.print("Enter Gender (M/F/O): ");
        if (sc.hasNext()) {
            gender = Character.toUpperCase(sc.next().charAt(0));
            if (gender != 'M' && gender != 'F' && gender != 'O') {
                System.out.println("Invalid Gender.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid Gender.");
            sc.close();
            return;
        }

        System.out.print("Enter Marital Status (M/U/S/D/W): ");
        if (sc.hasNext()) {
            maritalStatus = Character.toUpperCase(sc.next().charAt(0));
            if (maritalStatus != 'M' && maritalStatus != 'U' && maritalStatus != 'S' && maritalStatus != 'D' && maritalStatus != 'W') {
                System.out.println("Invalid Marital Status.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid Marital Status.");
            sc.close();
            return;
        }

        System.out.print("Enter Age: ");
        if (sc.hasNextByte()) {
            age = sc.nextByte();
            if (age < 18 || age > 60) {
                System.out.println("Age must be between 18 and 60.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid Age.");
            sc.close();
            return;
        }

        System.out.print("Enter Salary: ");
        if (sc.hasNextBigDecimal()) {
            salary = sc.nextBigDecimal();
            if (salary.compareTo(BigDecimal.ZERO) <= 0) {
                System.out.println("Salary must be greater than 0.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid Salary.");
            sc.close();
            return;
        }

        System.out.print("Enter Annual Salary: ");
        if (sc.hasNextBigDecimal()) {
            annualSalary = sc.nextBigDecimal();
        } else {
            System.out.println("Invalid Annual Salary.");
            sc.close();
            return;
        }

        System.out.print("Enter Bonus: ");
        if (sc.hasNextBigDecimal()) {
            bonus = sc.nextBigDecimal();
        } else {
            System.out.println("Invalid Bonus.");
            sc.close();
            return;
        }

        sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine().trim();

        System.out.print("Enter Department: ");
        department = sc.nextLine().trim();

        System.out.print("Enter Email: ");
        email = sc.nextLine().trim();
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid Email.");
            sc.close();
            return;
        }

        System.out.print("Enter Phone Number: ");
        phoneNumber = sc.nextLine().trim();
        if (!phoneNumber.matches("\\d{10}")) {
            System.out.println("Phone Number must contain exactly 10 digits.");
            sc.close();
            return;
        }

        System.out.print("Enter ATM PIN: ");
        if (sc.hasNextInt()) {
            atmPin = sc.nextInt();
            if (atmPin < 1000 || atmPin > 9999) {
                System.out.println("ATM PIN must be 4 digits.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid ATM PIN.");
            sc.close();
            return;
        }

        System.out.print("Enter Height (meters): ");
        if (sc.hasNextFloat()) {
            height = sc.nextFloat();
            if (height < 0.5f || height > 2.5f) {
                System.out.println("Invalid Height.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid Height.");
            sc.close();
            return;
        }

        System.out.print("Enter Experience (Years): ");
        if (sc.hasNextByte()) {
            experience = sc.nextByte();
        } else {
            System.out.println("Invalid Experience.");
            sc.close();
            return;
        }

        System.out.print("Enter Aadhaar Number: ");
        if (sc.hasNextBigInteger()) {
            aadhaarNumber = sc.nextBigInteger();
            if (aadhaarNumber.toString().length() != 12) {
                System.out.println("Aadhaar Number must contain exactly 12 digits.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid Aadhaar Number.");
            sc.close();
            return;
        }

        System.out.println("\nEmployee Details");
        System.out.println("Employee ID    : " + employeeId);
        System.out.println("Name           : " + employeeName);
        System.out.println("Father's Name  : " + fatherName);
        System.out.println("Gender         : " + gender);
        System.out.println("Marital Status : " + maritalStatus);
        System.out.println("Age            : " + age);
        System.out.println("Salary         : " + salary);
        System.out.println("Annual Salary  : " + annualSalary);
        System.out.println("Bonus          : " + bonus);
        System.out.println("Address        : " + address);
        System.out.println("Department     : " + department);
        System.out.println("Email          : " + email);
        System.out.println("Phone Number   : " + phoneNumber);
        System.out.println("ATM PIN        : " + atmPin);
        System.out.println("Height         : " + height + " m");
        System.out.println("Experience     : " + experience + " years");
        System.out.println("Aadhaar Number : " + aadhaarNumber);

        sc.close();
    }
}