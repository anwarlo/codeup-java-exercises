package InClassPractice;

public class ExceptionsPractice {
    public static void main(String[] args) {

    System.out.printf("Here we are at the start of the program%n");

    String[] words = {"one","two","three"};
    int i = 3;

    try {
        if (i < 0 || i >= words.length){
            //array index is out of bounds!!
            throw new Exception("Array index is out bounds\n");
        }
        System.out.printf("Here we are in the danger zone!!%n");
        System.out.println(words[i]);
    }
    catch (ArrayIndexOutOfBoundsException ex){
        System.out.printf("We are catching the built in exception%n");
        System.out.println(ex);
    }
    catch (Exception e){
        System.out.printf("We are catching our exceptions%n");
        System.out.println(e);
    }
        System.out.println("Here we are at the end of our program");
    }

}
