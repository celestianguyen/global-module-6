package exercises;

/*
Find the Greatest Common Divisor (GCD)
Problem
Write a method that returns the Greatest Common Divisor (GCD) of two integers.
 */
public class Exercise4 {
    public static int gcd(int a, int b){
        int max = 0;
        for(int i = 1; i <= Math.min(a,b); i++){
            if ((a % i == 0) && (b % i == 0)){
                max = i;
            }
        }
        return max;
    }

    static void main() {
        System.out.println("gcd of 75 and 100: " + gcd(75,100));
    }

}
