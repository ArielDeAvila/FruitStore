package Models;

import java.util.ArrayList;

public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    public void setColors(String name) {
        this.colors.add(name);
    }

    public ArrayList<String> getColors() {
        return this.colors;
    }
}
