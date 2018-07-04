package com.javarush.task.task21.task2113;

public class Horse {

    String name;
    double speed;
    double distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public static void main(String[] args) {

    }

    public void move() {
        distance += speed * Math.random();
    }

    public void print() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < (int) getDistance(); i++) {
            sb.append('.');
        }
        System.out.println(sb + this.name);
    }

}
