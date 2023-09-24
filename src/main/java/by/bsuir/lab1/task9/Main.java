package by.bsuir.lab1.task9;

import by.bsuir.lab1.task9.classes.Ball;
import by.bsuir.lab1.task9.classes.Basket;
import by.bsuir.lab1.task9.controllers.BasketController;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        BasketController controller = new BasketController(new Basket(22));
        controller.addBall(new Ball(1, Color.GREEN));
        controller.addBall(new Ball(2, Color.BLUE));
        controller.addBall(new Ball(3, Color.GREEN));
        controller.addBall(new Ball(13, Color.GREEN));
        System.out.println(controller.countBalls(Color.BLUE));
    }
}
