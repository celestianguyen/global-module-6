package exercises;

import java.util.Scanner;

/*
Input and Display Information of n Employees
Problem
Write a program to input information of n employees in a company (n is entered from the keyboard, n ≤ 5).
The required information is the same as in the previous exercise (full name, age, gender, basic salary, and university graduation GPA (on a 10-point scale))
After entering all data, print the information of all employees.
Note: Print the information of all employees at the same time. Do not print employee information immediately after entering each one.
 */
public class Exercise7 {
    private static String fullName1, gender1;
    private static byte age1;
    private static double basicSalary1, gpa1;

    private static String fullName2, gender2;
    private static byte age2;
    private static double basicSalary2, gpa2;

    private static String fullName3, gender3;
    private static byte age3;
    private static double basicSalary3, gpa3;

    private static String fullName4, gender4;
    private static byte age4;
    private static double basicSalary4, gpa4;

    private static String fullName5, gender5;
    private static byte age5;
    private static double basicSalary5, gpa5;

    private static final Scanner scanner = new Scanner(System.in);

    private static String readString(String prompt) {
        String str;
        while (true) { //~> loops forever unless encounters break/return
            System.out.print(prompt);
            str = scanner.nextLine().trim();
            if (!str.isEmpty()) return str; //stops the loop by returning from method
            System.out.println("Invalid! Input cannot be empty. Please try again!");
        }
    }

    private static Byte readByte(String prompt) {
        String b;
        while (true) {
            System.out.print(prompt);
            b = scanner.nextLine().trim();
            try {
                return Byte.parseByte(b);

            } catch (NumberFormatException e) {
                System.out.println("Please enter valid byte!");
            }
        }
    }

    private static Double readDouble(String prompt) {
        String d;
        while (true) {
            System.out.print(prompt);
            d = scanner.nextLine().trim();
            try {
                return Double.parseDouble(d);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a double!");
            }
        }

    }

    private static void inputEmployee1() {
        System.out.println("---Input employee 1's info ---");
        fullName1 = readString("Please enter full name: ");
        age1 = readByte("Please enter age: ");
        gender1 = readString("Please enter gender: ");
        basicSalary1 = readDouble("Please enter basic salary: ");
        gpa1 = readDouble("Please enter gpa (on a 10-point scale: ");

    }

    private static void inputEmployee2() {
        System.out.println("---Input employee 2's info ---");
        fullName2 = readString("Please enter full name: ");
        age2 = readByte("Please enter age: ");
        gender2 = readString("Please enter gender: ");
        basicSalary2 = readDouble("Please enter basic salary: ");
        gpa2 = readDouble("Please enter gpa (on a 10-point scale: ");
    }

    private static void inputEmployee3() {
        System.out.println("---Input employee 3's info ---");
        fullName3 = readString("Please enter full name: ");
        age3 = readByte("Please enter age: ");
        gender3 = readString("Please enter gender: ");
        basicSalary3 = readDouble("Please enter basic salary: ");
        gpa3 = readDouble("Please enter gpa (on a 10-point scale: ");

    }

    private static void inputEmployee4() {
        System.out.println("---Input employee 4's info ---");
        fullName4 = readString("Please enter full name: ");
        age4 = readByte("Please enter age: ");
        gender4 = readString("Please enter gender: ");
        basicSalary4 = readDouble("Please enter basic salary: ");
        gpa4 = readDouble("Please enter gpa (on a 10-point scale: ");

    }

    private static void inputEmployee5() {
        System.out.println("---Input employee 5's info ---");
        fullName5 = readString("Please enter full name: ");
        age5 = readByte("Please enter age: ");
        gender5 = readString("Please enter gender: ");
        basicSalary5 = readDouble("Please enter basic salary: ");
        gpa5 = readDouble("Please enter gpa (on a 10-point scale: ");

    }

    private static void printEmployee1() {
        System.out.println("---Employee 1's info---");
        System.out.println("Full name: " + fullName1);
        System.out.println("Age: " + age1);
        System.out.println("Gender: " + gender1);
        System.out.println("Basic salary: $" + basicSalary1);
        System.out.println("University gpa: " + gpa1);

    }

    private static void printEmployee2() {
        System.out.println("---Employee 2's info---");
        System.out.println("Full name: " + fullName2);
        System.out.println("Age: " + age2);
        System.out.println("Gender: " + gender2);
        System.out.println("Basic salary: $" + basicSalary2);
        System.out.println("University gpa: " + gpa2);

    }

    private static void printEmployee3() {
        System.out.println("---Employee 3's info---");
        System.out.println("Full name: " + fullName3);
        System.out.println("Age: " + age3);
        System.out.println("Gender: " + gender3);
        System.out.println("Basic salary: $" + basicSalary3);
        System.out.println("University gpa: " + gpa3);

    }

    private static void printEmployee4() {
        System.out.println("---Employee 4's info---");
        System.out.println("Full name: " + fullName4);
        System.out.println("Age: " + age4);
        System.out.println("Gender: " + gender4);
        System.out.println("Basic salary: $" + basicSalary4);
        System.out.println("University gpa: " + gpa4);

    }

    private static void printEmployee5() {
        System.out.println("---Employee 5's info---");
        System.out.println("Full name: " + fullName5);
        System.out.println("Age: " + age5);
        System.out.println("Gender: " + gender5);
        System.out.println("Basic salary: $" + basicSalary5);
        System.out.println("University gpa: " + gpa5);

    }

    static void main(String[] args) {
        Byte n = 0;
        String s;
        while (true) {
            System.out.print("Please enter the number of employees whose info you want to input (1-5): ");
            s = scanner.nextLine().trim();

            try {
                n = Byte.parseByte(s);
                if (n < 1 || n > 5) {
                    System.out.println("The number of employees should only be in the range of 1-5.");
                    continue;
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid! Please enter a byte.");

            }
        }

        switch (n) {
            case 1:
                inputEmployee1();
                System.out.println("---All employees' info---");
                printEmployee1();
                break;
            case 2:
                inputEmployee1();
                inputEmployee2();
                System.out.println("---All employees' info---");
                printEmployee1();
                printEmployee2();
                break;
            case 3:
                inputEmployee1();
                inputEmployee2();
                inputEmployee3();
                System.out.println("---All employees' info---");
                printEmployee1();
                printEmployee2();
                printEmployee3();
                break;

            case 4:
                inputEmployee1();
                inputEmployee2();
                inputEmployee3();
                inputEmployee4();
                System.out.println("---All employees' info---");
                printEmployee1();
                printEmployee2();
                printEmployee3();
                printEmployee4();
                break;

            case 5:
                inputEmployee1();
                inputEmployee2();
                inputEmployee3();
                inputEmployee4();
                inputEmployee5();
                System.out.println("---All employees' info---");
                printEmployee1();
                printEmployee2();
                printEmployee3();
                printEmployee4();
                printEmployee5();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + n);
        }
    }
}
