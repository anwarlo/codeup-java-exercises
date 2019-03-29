package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);



    public String getString(String string){
        return string;
    }

    public boolean yesNo(String string){
        scanner.nextBoolean();
        if (string.toLowerCase().equals("y") || string.toLowerCase().equals("yes"))
            return true;
        else
            return false;
    }

    public int  getInt(int min, int max){
        int output;
        while(!scanner.hasNextInt()){
            System.out.printf("Invalid input. Enter a valid integer between %d and %d: ", min, max);
            scanner.next();
        }
        output =scanner.nextInt();
        if(output < min || output > max) {
            System.out.printf("Invalid range. Enter a valid integer between %d and %d: ", min, max);
            return getInt(min, max);
        }
        return output;
    }

    public int getInt(){
        return getInt(1,10);
    }

    public double getDouble(double min, double max){
        double output;

        while(!scanner.hasNextDouble()){
            System.out.printf("Invalid input. Enter a valid integer between %d and %d: ", min, max);
            scanner.next();
        }
        output =scanner.nextDouble();
        if(output < min || output > max) {
            System.out.printf("Invalid range. Enter a valid integer between %d and %d: ", min, max);
            return getDouble(min, max);
        }
        return output;
    }


    double getDouble(){
return getDouble(1,10);
    }


}
