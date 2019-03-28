import java.util.Arrays;

public class ArraysLesson {

    public static void main(String[] args) {

        int[] numbers = new int[7];

        boolean[] decisions = {true,true,false,false};

//        boolean[] decisions = new boolean[4];

//        boolean decisions[] = new boolean[4]; Another way to create the same thing with brackets on name instead of type.

        String[] answers = new String[4];

       answers[0] = "Yes";

       answers[1] = "True";

//       answers[7] = "Something's wrong"; Out of bounds of array will cause exception.

        System.out.println(answers[answers.length - 1]);
        //above will return null for uninitialized object because 2 and 3 in array not defined.

        if (numbers[4] == 0) System.out.println("It really is zero");


        int[] orderQuantities = {4,8,12,24};

        boolean[] autoBoolean = {true,false,true,false};

        String[] autoResponses = {"Yes", "No", "Thank You","Your Welcome", "Have a nice day", "we appreciate your business"};

        String[] carGarageModels = {"Tesla Model 3", "Chevrolet Corvette","Chrysler Pacifica", "Ford Mustang"};

//        System.out.println(Arrays.toString(carGarageModels));
//        System.out.println(carGarageModels[1]);

        for (String car : carGarageModels){
            System.out.println(car);
        }

        Arrays.sort(carGarageModels);

String[] favoriteCars = Arrays.copyOf(carGarageModels,2);

for (String car : favoriteCars){
    System.out.println(car);
}




    }
}
