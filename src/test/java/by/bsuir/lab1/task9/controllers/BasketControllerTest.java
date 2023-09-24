package by.bsuir.lab1.task9.controllers;

import by.bsuir.lab1.task9.classes.Ball;
import by.bsuir.lab1.task9.classes.Basket;
import org.junit.jupiter.api.Test;

import java.awt.Color;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketControllerTest {

    @Test
    void checkAddingNullBall() {
        assertFalse(new BasketController(new Basket(10)).addBall(null));
    }

    @Test
    void checkFillingFullBasket() {
        assertFalse(new BasketController(new Basket(15)).addBall(new Ball(16, Color.BLUE)));
    }

    @Test
    void checkAddingNormalBall() {
        assertTrue(new BasketController(new Basket(10)).addBall(new Ball(10, Color.GREEN)));
    }

    @Test
    void checkCountingZeroBalls() {
        BasketController controller = new BasketController(new Basket(22));
        controller.addBall(new Ball(1, Color.GREEN));
        controller.addBall(new Ball(2, Color.BLUE));
        controller.addBall(new Ball(3, Color.GREEN));
        controller.addBall(new Ball(13, Color.GREEN));
        assertEquals(0, controller.countBalls(Color.RED));
    }

    @Test
    void checkCountingGreenBalls() {
        BasketController controller = new BasketController(new Basket(22));
        controller.addBall(new Ball(1, Color.GREEN));
        controller.addBall(new Ball(2, Color.BLUE));
        controller.addBall(new Ball(3, Color.GREEN));
        controller.addBall(new Ball(13, Color.GREEN));
        assertEquals(3, controller.countBalls(Color.GREEN));
    }
}