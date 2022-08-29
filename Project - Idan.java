import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Input from the system
        System.out.println("Hello, welcome to my short IQ test!"); // Typing this text - ASK
        System.out.println("First,what's your name?");
        String name = scan.nextLine(); // sync the system from String keyboard
        System.out.println("Hello" + " " + name.toUpperCase() + "!"); // Typing this text + variable 'name' - ANSWER
        System.out.println("How old are you?"); // Typing this text - ASK
        int age = scan.nextInt(); // Sync a method with a int variable 'age'
        scan.nextLine(); // it consumes the /n character
        if (age >= 18) { // Setting a condition with variable 'age' >=18
            System.out.println("Great age" + " " + name.toUpperCase() + "!"); // Typing this text - ANSWER
        } else { // Setting a condition while not
            System.out.println("Sorry! you're too young"); // Typing this text while not - ANSWER
        }
        System.out.println("OK" + " " + name.toUpperCase() + " " + ",I will ask you a few questions,if you agree  - write 'OK'"); // Typing this text - ANSWER
        String answer = scan.nextLine(); // sync an input from System
        System.out.println("Your answer is " + answer.toUpperCase() + " " + ",so..."); // Text after my answer
        if (answer.equalsIgnoreCase("OK")) { // if another "ok" input answer
            System.out.println("Let's start! :)"); // Text after the answer
            System.out.println("First quastion..");
            System.out.println("How much is 5 multiply by 12 ?"); // Text of first quastion
        } else { // Setting a condition while not
            System.out.println("That's fine too, thanks anyway! :)"); // Text while bad answer
        }
        int answer1 = scan.nextInt(); // Sync input int from System with a variable
        if (answer1 != 60) { // set a condition to a variable
            System.out.println("You need to improve your math" + name.toUpperCase() + " " + "!"); // Text false
        } else { // Setting a condition while not
            System.out.println("Let's move on to the next question," + name.toUpperCase() + "!"); // text to continue
            System.out.println("What is your favorite hobby,"soccer || basketball"?"); // set a quastion num 2
        }

        if (answer3 != "basketball") { // set a variable as known soccer
            System.out.println("Did 'Liverpool' win the last English Championship?" + " " + "'Yes' or 'No'?");
            String answer4 - scan.nextLine();
            if (answer4.equalsIgnoreCase("NO")) {
                System.out.println("That's right!");
                System.out.println("Let's continue!");
            } else {
                System.out.println("Sorry,that's false!");
            }
        } else {
            System.out.println("Did 'Golden State Warriors' won NBA championship?" + " " + "'Yes' or 'No'");
            String answer5 = scan.nextLine();
            if (answer5.equalsIgnoreCase("YES")) {
                System.out.println("That's right" + " " + name.toUpperCase() + "!");
                System.out.println("Let's continue!");
            } else {
                System.out.println("Sorry,that's false!");
            }

        }
    }
}