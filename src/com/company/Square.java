package com.company;

import java.util.Random;

public class Square extends Figure {

    protected Point [] points = {
            new Point(0, 0),
            new Point(0, 0),
            new Point(0, 0),
            new Point(0, 0)
    };
    
    public void randomPoints(){
        Random rand = new Random();

        int length = rand.nextInt((100 - 1) + 1) + 1;
        int x = rand.nextInt((100 - 0) + 1) + 0;
        int y = rand.nextInt((100 - 0) + 1) + 0;

        this.points[0].x = x;
        this.points[0].y = y;

        this.points[1].x = x + length;
        this.points[1].y = y;

        this.points[2].x = x + length;
        this.points[2].y = y + length;

        this.points[3].x = x;
        this.points[3].y = y + length;

        // for (int i = 0; i < 4; i++)
        //    System.out.println(String.format("%d, %d", this.points[i].x, this.points[i].y));
    }

    public double lengthOfSide() {
        return Math.abs(this.points[0].x - this.points[1].x);
    }

    public double getArea() {
        return Math.pow(this.lengthOfSide(), 2);
    }

    public String print() {
        return String.format(
                "Figure: Square, Area: %f, sidelength : %f, Color: %s",
                this.getArea(), this.lengthOfSide(), this.getColor()
        );
    }
}
