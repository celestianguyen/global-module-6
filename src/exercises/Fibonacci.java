package exercises;

public class Fibonacci {

    public static void printFibonacci(int n) {

        if (n <= 0) {
            System.out.println("n must be positive");
            return;
        }

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int res = a + b;
            a = b;
            b = res;
        }
    }

   static void main(String[] args) {
        printFibonacci(7);
    }
}
