package com.company;

import java.util.Random;

public class Triangle extends Figure {

    protected Point [] points = {
            new Point(0, 0),
            new Point(0, 0),
            new Point(0, 0)
    };

    public void randomPoints() {
        Random rand = new Random();

        int lengthTop = rand.nextInt((100 - 1) + 1) + 1;
        int lengthBottom = rand.nextInt((100 - lengthTop) + 1) + lengthTop;

        int x = rand.nextInt((100 - 1) + 1) + 1;
        int y = rand.nextInt((100 - 1) + 1) + 1;

        this.points[0] = new Point(x, y);
        this.points[1] = new Point(x, y + lengthTop);
        this.points[2] = new Point(x + lengthBottom, y);

        // for (int i = 0; i < 3; i++)
        //    System.out.println(String.format("%d, %d", this.points[i].x, this.points[i].y));
    }


    public double getArea() {
        double a, b, c;
        a = Math.abs(this.points[1].x  - this.points[2].x);
        b = Math.abs(this.points[0].y  - this.points[1].y);
        c = this.hypotenuse();
        double p = (a + b + c) / 2; // p - пивпериметер триугольника
       return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    public double hypotenuse() {
        double kat = Math.abs(this.points[1].x  - this.points[2].x);
        double kat2 = Math.abs(this.points[0].y  - this.points[1].y);

        return  Math.sqrt(Math.pow(kat, 2) + Math.pow(kat2, 2));
    }

    public String print() {
        return String.format(
                "Figure: Triangle, Area: %f, Hypotenuse: %f, Color: %s",
                this.getArea(), this.hypotenuse(), this.getColor()
        );
    }
}
