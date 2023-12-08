package bg.smg;

import javax.swing.*;

public class FoodInADish<T> extends DrawableObject implements Comparable<FoodInADish<T>>{
    private T food;
    private String dishColor;

    public FoodInADish(int xCoord, int yCoord, int width, int height, T food, String dishColor) {
        super(xCoord, yCoord, width, height);
        this.food = food;
        this.dishColor = dishColor;
    }

    public FoodInADish(T food, String dishColor) {
        this.food = food;
        this.dishColor = dishColor;
    }


    public FoodInADish() {
    }

    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public String getDishColor() {
        return dishColor;
    }

    public void setDishColor(String dishColor) {
        this.dishColor = dishColor;
    }

    @Override
    public JPanel draw() {
        JPanel panel = new JPanel();
        panel.setBounds(0,0,200,400);

        ImageIcon foodImg = new ImageIcon("resources/"+food+".png");
        ImageIcon dishImg = new ImageIcon("resources/"+dishColor+".png");

        JLabel foodLabel = new JLabel(foodImg);
        JLabel dishLabel = new JLabel(dishImg);

        foodLabel.setBounds(0,0,200,200);
        dishLabel.setBounds(0,200,200, 200);

        panel.add(foodLabel);
        panel.add(dishLabel);

        return panel;
    }

    @Override
    public int compareTo(FoodInADish<T> o) {
        if(this.getFood() instanceof Fruit && o.getFood() instanceof Fruit) {
            return Double.compare(((Fruit) this.getFood()).getKg(), ((Fruit) o.getFood()).getKg());
        } else if(this.getFood() instanceof Vegetable && o.getFood() instanceof Vegetable) {
            return Double.compare(((Vegetable) this.getFood()).getKg(), ((Vegetable) this.getFood()).getKg());
        } else if(this.getFood() instanceof Fruit) {
            return -1;
        } else
            return 1;
    }
}
