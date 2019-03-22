import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner numScan = new Scanner(System.in);
        System.out.println("What number would you like to go to?");
        int num = numScan.nextInt();
        System.out.println("Here is your table!%n");
        System.out.println("number | squared | cubed%n");
        System.out.println("------ | ------- | -----%n");
    for (int i = 1; i <= num; i++) {
int squared = (num *= num);
int cubed = squared *= num;
int digits = Integer.toString(squared).length();

if (digits <= 1)
        System.out.println(num + "      | " + squared + "       | " + cubed + "%n");
else
    System.out.println(num + "      | " + squared + "       | " + cubed + "%n");
        }
    }
}
//    Do While
//
//    Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
