package Part3ImprovedConversation;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the music recommendation algorithm. PLease enter your name:  ");
        if (!input.hasNextLine()){
            System.out.println("Your name should be given in letter, please try again.");
        }
        else {
            String name = input.nextLine();
            System.out.println("Hello " + name + "! Please enter your age: ");
            if (!input.hasNextInt()){
                System.out.println("You should use number to enter age, please try again.");
            }
            else {
                int age = input.nextInt();
                input.nextLine();
                System.out.println("What genre of music do you prefer more? Rock, Metal or Alternative? ");
                if (!input.hasNextLine()){
                    System.out.println("Please, specify your favorite genre textually, choose Rock, Metal or Alternative");
                }
                else {
                    String genre = input.nextLine();
                    if ((age < 18) && (genre.contains("ock"))) {
                        System.out.println("I would recommend you to listen: The Black Moods");
                    }
                    if ((age < 18) && (genre.contains("etal"))) {
                        System.out.println("I would recommend you to listen: Alter Bridge ");

                    }
                    if ((age >= 18) && (genre.contains("lternative"))) {
                        System.out.println("I would recommend you to listen: Arctic Monkeys");
                    }
                    if ((age >= 18) && (genre.contains("ock")) && (age < 40)) {
                        System.out.println("I would recommend you to listen: Foo Fighters");
                    }
                    if ((age >= 18) && (genre.contains("etal")) && (age < 40)) {
                        System.out.println("I would recommend you to listen: Korn ");

                    }
                    if ((age >= 18) && (genre.contains("lternative")) && (age < 40)) {
                        System.out.println("I would recommend you to listen: Muse");
                    }
                    if ((age >= 40) && (genre.contains("ock"))) {
                        System.out.println("I would recommend you to listen: The Who");
                    }
                    if ((age >= 40) && (genre.contains("etal"))) {
                        System.out.println("I would recommend you to listen: Metallica ");

                    }
                    if ((age >= 40) && (genre.contains("lternative"))) {
                        System.out.println("I would recommend you to listen: Nirvana ");
                    } else {
                        System.out.println("Sorry! I have no idea what recommendation to give.");
                    }
                }
            }
        }
    }


}
