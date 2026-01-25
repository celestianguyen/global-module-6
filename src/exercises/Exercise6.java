package exercises;

import java.util.Scanner;

/*
Problem
Write a program to input information of an employee in a company.
The required information includes: full name, age, gender, basic salary, and university graduation GPA (on a 10-point scale).
After entering the data, print out the entered information.
 */
public class Exercise6 {
    private static String fullName;
    private static byte age;
    private static String gender;
    private static long basicSalary;
    private static double gpa;

    private static void inputEmployeeInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        fullName = scanner.nextLine().trim();
        System.out.print("Please enter age: ");
        age = Byte.parseByte(scanner.nextLine().trim());
        System.out.print("Please enter gender: ");
        gender = scanner.nextLine().trim();
        System.out.print("Please enter basic salary: ");
        basicSalary = Long.parseLong(scanner.nextLine().trim());
        System.out.print("Please enter university graduation GPA (on a 10-point scale): ");
        gpa = Double.parseDouble(scanner.nextLine().trim());

    }
    private static void printEmployeeInfo(){
        System.out.println("---Employee's information---");
        System.out.println("Full name: " + fullName);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
        System.out.println("basic salary: " + basicSalary);
        System.out.println("University graduation GPA (on a 10-point scale: " + gpa);

    }
    static void main(String[] args) {
        inputEmployeeInfo();
        printEmployeeInfo();

    }
}
