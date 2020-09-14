package ru.mirea.Lab2.Ball;
import java.lang.*;
import java.util.Scanner;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    public Ball(){}
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    static void setXYSpeed(){
        Scanner in = new Scanner(System.in);
        System.out.print("Set the speed of the sword: ");
        double speed = in.nextDouble();
        System.out.println("Ball Speed = "+speed);
        in.close();
    }
    public void move( double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    @Override
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}
