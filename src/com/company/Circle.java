package com.company;

import java.util.Random;

class Circle extends Figure {

    private Point center = new Point(0,0);
    private int radius = 0;

    public void randomPoints()
    {
        Random rand = new Random();
        this.radius = rand.nextInt((100 - 0) + 1) + 0;

        int x = rand.nextInt((100 - 0) + 1) + 0;
        int y = rand.nextInt((100 - 0) + 1) + 0;
        this.center = new Point(x, y);
    }

    public double getArea() {
        return this.radius * 3.14;
    }

    public double lenghtOfCircle(){
        return  2 * this.radius * 3.14;
    }

    public String print() {
        return String.format("Circle, Radius: %d, Area: %f, circlelength: %f, Color: %s", this.radius, this.getArea(), this.lenghtOfCircle(), this.getColor());
    }

}

