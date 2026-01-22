package exercises;


public class Exercise2 {
    //a. Return the reversed number
    public static int reversedNum(int n){
        int rev = 0;
        while (n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    //b. Check whether the number is a palindrome (return true / false)
    public static boolean isPalindrome(int n){
        return n == reversedNum(n);
    }

    //c. Check whether the number is a perfect square
    public static boolean isSquare(int n){

        return (double) n == (Math.sqrt(n) * Math.sqrt(n));
    }

    //d. Check whether the number is a prime number


    public static void main(String[] args) {
        System.out.println("reversed number of 12: " + reversedNum(12));
        System.out.println("Number 12021 is a palindrome: " + isPalindrome(12021));
        System.out.println("10 is a perfect square: " + isSquare(10));
        System.out.println("9 is a perfect square: " + isSquare(9));


    }
}
