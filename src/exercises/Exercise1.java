package exercises;

/*
Conditional Statements and Branching
Problem
Exercises for the topic Conditional Statements and Branching:
a. Write a method to convert an uppercase character to a lowercase character.
 */
public class Exercise1 {
    public static char toLowerCase(char upper){
        if (upper >= 65 && upper <= 90){
            return (char) (upper + 32);
        }
        return upper;
    }

    //b. solve linear equation
    public static void linear(double a, double b) {
        if (a == 0) {
            String str = (b == 0) ? "The equation has infinitely many solutions." : "The equation has no solution.";
        } else {
            double x = -b / a;
            System.out.println("The solution is x = " + x);
        }
    }

    //c. solve quadratic equation
    public static void quadratic(double a, double b, double c) {
        if (a == 0) {
            linear(b, c);
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("The equation has no real solutions.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("The equation has one solution: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has 2 solutions:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    //d. smallest
    public static int min(int a, int b, int c, int d) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        if (d < smallest) {
            smallest = d;
        }

        return smallest;
    }
    public static void main(String[] args) {
        char upper = 67;
        System.out.println(toLowerCase(upper));


    }


}

