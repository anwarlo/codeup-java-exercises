public class StringExercise {
    public static void main(String[] args) {
        String message1 = "We don't need no education\nWe don't need no thought control\n";
        System.out.println(message1);

        String message2 = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(message2);

        String message3 = "In windows, the main drive is usually C:\\\n";
        System.out.println(message3);

        String message4 = "I can do backslashes \\,\ndouble backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";
        System.out.println(message4);


        String completeMessage = message1 + message2 + message3 + message4;
        System.out.println(completeMessage);
    }
}
