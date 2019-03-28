package oop;

public class RestaurantTest{
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();

        dish.costInCents = 99;
        dish.nameOfDish = "Taco on a stick";
        dish.wouldRecommend = true;
        dish.eat();

        System.out.printf("%n %d %n %s %n %b",
                dish.costInCents,
                dish.nameOfDish,
                dish.wouldRecommend);

    }
}