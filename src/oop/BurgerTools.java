package oop;

public class BurgerTools {
    public static String mostPopularTopping = "Cheese";
    public static int averageDaysBeforeExpiration = 14;
    public static int temperatureWhenCooked = 165;
    public static String grilled(){
        return "Grilling burger";
    }

    public BurgerTools(String popTop, int daysLeft, int cookTemp){
        BurgerTools.mostPopularTopping = popTop;
        BurgerTools.averageDaysBeforeExpiration = daysLeft;
        BurgerTools.temperatureWhenCooked = cookTemp;
    }



    public static void main(String[] args) {

        BurgerTools Monday = new BurgerTools("Grilled Onions",30,165);

        BurgerTools Tuesday = new BurgerTools("Avacadoes",7,0);

        System.out.println(Monday.mostPopularTopping);
        System.out.println(Monday.averageDaysBeforeExpiration);
        System.out.println();
        System.out.println(Monday.grilled());
    }

}
