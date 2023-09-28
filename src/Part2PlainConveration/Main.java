package Part2PlainConveration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you age: ");
        if (!input.hasNextInt()){
            System.out.println("Age is a number, please try again");

        }
        else {
            int age = input.nextInt();

            if ((age < 6) && (age>0)) {
                System.out.println("Yuo should probably go to kindergarten.");
            }
            if ((age > 7) && (age < 17)) {
                System.out.println("You should probably be in school by this time. ");
            }
            if ((age > 18) && (age < 22)) {
                System.out.println("You shouldn't not miss your lectures in University.");
            }
            if (age > 23) {
                System.out.println("You are probably working right now. Not gonna distract you.");
            }
            if (age > 60) {
                System.out.println("You are retired. Time to have tons of free time");
            }
            if (age<=0) {
                System.out.println("You have entered wrong number. Please try again.");
            }
        }

    }
}
