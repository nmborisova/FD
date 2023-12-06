package bg.smg;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<FoodInADish<Food>> dishes = new ArrayList<FoodInADish<Food>>();

        FoodInADish<Food> bananaBlue = new FoodInADish<Food>();
        FoodInADish<Food> appleGreen = new FoodInADish<Food>();

        Food banana = new Fruit();
        banana.setName("banana");
        banana.setKg(0.6);
        ((Fruit)banana).setReadyToEat(true);

        Food apple = new Fruit();
        apple.setName("apple");
        apple.setKg(0.4);
        ((Fruit)apple).setReadyToEat(true);

        bananaBlue.setFood(banana);
        bananaBlue.setDishColor("blue");

        appleGreen.setFood(apple);
        appleGreen.setDishColor("green");

        dishes.add(bananaBlue);
        dishes.add(appleGreen);

        Collections.sort(dishes);


    }
}
