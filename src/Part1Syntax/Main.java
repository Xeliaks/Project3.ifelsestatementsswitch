package Part1Syntax;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //part1 demonstrate use of control statements
        Scanner input = new Scanner(System.in);
        System.out.println("Write an integer: ");
        int i = input.nextInt();
        if (i % 2 == 0) {
            System.out.println("Integer i is even");
        } else {
            System.out.println("Integer i is odd");
        }
        switch (i) {
            case 1:
                System.out.println("Integer i is odd");
                break;
            case 2:
                System.out.println("Integer i is even");
                break;
            case 3:
                System.out.println("Integer i is odd");
                break;
            case 4:
                System.out.println("Integer i is even");
                break;
            case 5:
                System.out.println("Integer i is odd");
                break;
            case 6:
                System.out.println("Integer i is even");
                break;
            default:
                System.out.println("Integer i is unknown");
                break;
        }
        //Part2 demonstrate various relational operators in if condition statements
        int age = 21;
        if (age == 18) {
            System.out.println("Congrats! You are 18 years old.");
        }
        if (age != 18) {
            System.out.println("You are definitely not 18 years old");
        }
        if (age < 18) {
            System.out.println("You are younger than 18 years old.");
        }
        if (age > 18) {
            System.out.println("You are older than 18 years old.");
        }
        if (age <= 18) {
            System.out.println("You are younger than or  18 years old.");
        }
        if (age >= 18) {
            System.out.println("You are older than or  18 years old.");
        }
        //Part3 Compare strings using String.equals() inside if condition statement.
        String text1 = "Hello";
        String text2 = "Hell";
        if (text1.equals(text2)) {
            System.out.println("Text is the same.");
        }
        else {
            System.out.println("Text is different.");
        }
        //Part4 Demonstrate logical operators: &&, ||, ! inside if condition statement.
        int x = 0;
        int y = 9;
        if ((x == 0) || (y == 0) ) {
            System.out.println("X or Y is zero.");
        }
        if ((x == 0) && (y == 0)) {
            System.out.println("X and Y are both zero");
        }
        if (!((x == 0) && (y == 0))) {
            System.out.println("X and Y are both not zero");
        }
        //Part5 Demonstrate using conditions with user input.
        System.out.println("Please enter an integer: ");
        if (!input.hasNextInt()){
            System.out.println("I have asked you for an integer, please try again next time");
        }
        else {
            int num = input.nextInt();
            System.out.println("Your integer is: " + num);
        }
        //Part6 Demonstrate nested if/else conditionals
        if (x > 0) {
            System.out.println("X is positive.");
        } else {
            if (x < 0) {
                System.out.println("X is negative.");
            } else {
                System.out.println("X equals zero.");
            }
        }
    }
}