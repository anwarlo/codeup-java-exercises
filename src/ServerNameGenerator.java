import java.util.Random;

public class ServerNameGenerator {

    static String[] adjectives = {"Lovely","Magical","Noble","Stellar","Vivacious","Wondrous","Zappy","Ultimate","Plucky","Powerful"};

    static String[] nouns = {"Wombat","Armadillo","Badger","Chinchilla","Fox","Panda","Giraffe","Jellyfish","Quetzal","Salmon"};



     static String getRandomString(String[] array) {
//         Math.random() * array.length -1
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }


    public static void main(String[] args) {

        System.out.println("Here is your server name:\n" + getRandomString(adjectives) + "-" + getRandomString(nouns));

    }

}
