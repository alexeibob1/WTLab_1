package by.bsuir.lab1.task9.controllers;

import by.bsuir.lab1.task9.classes.Ball;
import by.bsuir.lab1.task9.classes.Basket;

import java.awt.*;
import java.util.ArrayList;

public class BasketController {
    private final Basket basket;

    public BasketController(Basket basket) {
        this.basket = basket;
    }

    public boolean addBall(Ball ball) {
        if (ball == null) {
            return false;
        }
        if (basket.getCurrWeight() + ball.getWeight() <= basket.getCapacity()) {
            this.basket.getBalls().add(ball);
            this.basket.setCurrWeight(this.basket.getCurrWeight() + ball.getWeight());
            return true;
        } else {
            return false;
        }
    }

    public int countBalls(Color color) {
        int amount = 0;
        for (Ball ball : this.basket.getBalls()) {
            if (ball.getColor() == color) {
                amount++;
            }
        }
        return amount;
    }
}
