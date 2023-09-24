package by.bsuir.lab1.task9.classes;

import java.awt.*;

public class Ball {
    private int weight;

    private Color color;

    public Ball(int volume, Color color) {
        this.weight = volume;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
