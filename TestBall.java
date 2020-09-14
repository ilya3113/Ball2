package ru.mirea.Lab2.Ball;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(10, 10);
        System.out.println(b1);
        b1.move(3, 5);
        System.out.println(b1);
        Ball.setXYSpeed();
    }
}
