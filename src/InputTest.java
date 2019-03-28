public class InputTest {

    public static void main(String[] args) {

        Input test = new Input();

        String testString = "Test";

        System.out.println(test.getString(testString));

        System.out.println(test.yesNo("Yes"));
        System.out.println(test.yesNo("blah"));

        System.out.println(test.getInt(1, 100));
    }

}
