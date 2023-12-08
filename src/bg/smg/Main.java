package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<FoodInADish<Food>> dishes = new ArrayList<FoodInADish<Food>>();

        FoodInADish<Food> bananaBlue = new FoodInADish<Food>();
        FoodInADish<Food> blueberryYellow = new FoodInADish<Food>();
        FoodInADish<Food> pepperGreen = new FoodInADish<Food>();

        Food banana = new Fruit();
        banana.setName("banana");
        banana.setKg(0.6);
        ((Fruit)banana).setReadyToEat(true);

        Food blueberry = new Fruit();
        blueberry.setName("blueberry");
        blueberry.setKg(0.9);
        ((Fruit)blueberry).setReadyToEat(true);

        Food pepper = new Vegetable();
        pepper.setName("pepper");
        pepper.setKg(0.7);
        ((Vegetable)pepper).setFresh(true);

        bananaBlue.setFood(banana);
        bananaBlue.setDishColor("blue");

        blueberryYellow.setFood(blueberry);
        blueberryYellow.setDishColor("yellow");

        pepperGreen.setFood(pepper);
        pepperGreen.setDishColor("green");

        dishes.add(blueberryYellow);
        dishes.add(pepperGreen);
        dishes.add(bananaBlue);

        Collections.sort(dishes);

        JFrame frame=new JFrame("FoodInADish");
        frame.setBackground(Color.WHITE);
        frame.setSize(800,400);
        frame.setLayout(new GridLayout(1, 12));
        for(FoodInADish<Food> currentFD : dishes) {
            JPanel panel = currentFD.draw();
            panel.setBounds(0, 0, currentFD.getWidth(), currentFD.getHeight());
            frame.add(panel);
        }
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
