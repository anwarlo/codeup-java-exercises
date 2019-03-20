import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
//        String name = "Anwar";
//        int amount = 42;
//        boolean lovesBurritos = true;
//        System.out.format("Hello there, %s. Nice to see you.\n", name);
//        String greeting = "Salutations";
//        System.out.format("%s, %s!", greeting, name);
//        System.out.format("%s, I heard that you can eat %s%n burritos. This is %s%n",name,amount,lovesBurritos);


//Scanner type to variable named scanner is assigned to a new instance of Scanner for System input.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//
//        System.out.print("Enter a number: ");
//        int userNumber = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//        System.out.println("You entered: --> \"" + userNumber + "\" <--");

        double pi = 3.14159;

                System.out.format("The value of pi is approximately %.2f", pi);

                Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        int userNumber = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userNumber + "\" <--");

        System.out.print("Enter three words");
        String userString = scanner.next();
        String words = userString.split(" ");

        System.out.println("You entered:\n" + userInput1 + "\n" + userInput2 + "\n" + userInput3);











    }
}
