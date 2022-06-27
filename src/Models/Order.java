package Models;

import java.util.ArrayList;

public class Order {
    private ArrayList<Fruit> fruits;
    private float totalOrder;

    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public void setTotalOrder(float totalOrder) {
        this.totalOrder = totalOrder;
    }

    public float getTotalOrder() {
        return totalOrder;
    }
}
