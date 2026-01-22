package exercises;

/*
Conditional Statements and Branching
Problem
Exercises for the topic Conditional Statements and Branching:
a. Write a method to convert an uppercase character to a lowercase character.
 */
public class Exercise1A {
    public static char toLowerCase(char upper){
        if (upper >= 65 && upper <= 90){
            return (char) (upper + 32);
        }
        return upper;
    }

    public static void main(String[] args) {
        char upper = 67;
        System.out.println(toLowerCase(upper));
    }
}

