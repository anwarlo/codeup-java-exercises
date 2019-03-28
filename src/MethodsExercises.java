import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addition(5,5));
        System.out.println(subtraction(5,5));
        System.out.println(multiplication(5,5));
        System.out.println(division(10,0));
        System.out.println(modulus(10,5));
//        System.out.println(getInteger(1,10));
    }

    public static int addition(int a, int b){
            return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static double division(double a, double b){
        return a / b;
    }

    public static double modulus(int a, int b){
        return a % b;
    }


//
//    public static int getInteger(int min, int max) {
//
//        num = new Scanner(System.in).nextInt();
//        String prompt =  "your number is in the range!";
//
//
//        do {
//            System.out.println("Enter a number between " + min + " and " + max + ": ");
//            return num;
//
//        } while (num < min || num > max);


}

//
//
//
//}
