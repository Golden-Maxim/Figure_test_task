package com.company;

import java.util.Random;

public class Trapezoid extends Square {


    public  void  randomPoints()
    {
        int tmp;

        Random rand = new Random();

        int lengthTop = rand.nextInt((100 - 1) + 1) + 1;
        int x = rand.nextInt((100 - 1) + 1) + 1;
        int y = rand.nextInt((100 - 1) + 1) + 1;

        this.points[0] = new Point(x, y);
        this.points[1] = new Point(x + lengthTop, y);

        int lengthBottom = rand.nextInt((100 - lengthTop) + 1) + lengthTop;
        int x_ = rand.nextInt((x - 0) + 1) + 0;
        int y_ = rand.nextInt((y - 0) + 1) + 0;

        this.points[2] = new Point(x_, y_);
        this.points[3] = new Point(x_ + lengthBottom, y_);

        // for (int i = 0; i < 4; i++)
        //    System.out.println(String.format("%d, %d", this.points[i].x, this.points[i].y));
    }

    public String print() {
        return String.format(
                "Figure: Trapezoid, Area: %f, averageLine: %f, Color: %s",
                this.getArea(), this.averageLine(), this.getColor()
        );
    }

    public double averageLine()
        {
            double tmp;
            tmp = Math.abs(this.points[0].x - this.points[1].x);
               return (tmp + Math.abs(this.points[2].x - this.points[3].x)) / 2;
        }


}
