import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean bobIsStillTalking = true;



        String question = "Sure.";

        String exclamation = "Whoa, chill out!";

        String empty = "Fine. Be that way!";

        String anything = "Whatever.";


        do {
            System.out.println("Your conversation with Bob has started:\n(To end your conversation enter exit.)");
            System.out.println("\nBob says: Yeah!?");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println(empty);
            }
            else if (input.endsWith("?")) {
                System.out.println(question);
            }
            else if (input.endsWith("!")) {
                System.out.println(exclamation);
            }
            else if (input.equals("exit")) {
                System.out.println("Bob says: Later...");
                bobIsStillTalking = false;
            }
            else {
                System.out.println(anything);
            }
        } while (bobIsStillTalking);

    }
}
