import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "";  // update this variable with the response

        // Write code here to generate a random number from 1 to 6
        int randNum = (int)Math.round((Math.random() * 6) + 1);

        // Write code here to use
        // appropriate selection statements (if, if else, else)
        // to choose from 1 of 6 responses and set response to it.
        // for example, if the number is 1, set response to "Outlook good"
        // if it’s 2, set response to "Without a doubt!"
        // etc.

        if (randNum == 1) {
            response = "Signs point to yes";
        }
        if (randNum == 2) {
            response = "Better not tell you now";
        }
        if (randNum == 3) {
            response = "Very doubtful";
        }
        if (randNum == 4) {
            response = "It is decidedly so";
        }
        if (randNum == 5) {
            response = "Reply hazy, try again";
        }
        if (randNum == 6) {
            response = "Don't count on it";
        }

        System.out.println(response);  // print response
    }
}