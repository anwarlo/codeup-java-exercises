public class ControlFlowExercises {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i <= num; i++) {

            if (i % 5 == 0 && i % 3 == 0)
                System.out.println("FizzBuzz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(i);

        }
    }
}
//    Do While
//
//    Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
