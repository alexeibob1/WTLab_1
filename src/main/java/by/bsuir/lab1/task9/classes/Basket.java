package by.bsuir.lab1.task9.classes;

import java.util.ArrayList;

public class Basket {
    private int capacity;

    private int currWeight;

    private ArrayList<Ball> balls;

    public Basket() {
        this.capacity = 0;
        balls = new ArrayList<>();
    }

    public Basket(int capacity) {
        this.capacity = capacity;
        balls = new ArrayList<>(this.capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrWeight() {
        return currWeight;
    }

    public void setCurrWeight(int currWeight) {
        this.currWeight = currWeight;
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }
}