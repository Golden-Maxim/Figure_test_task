package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int count = rand.nextInt((100 - 10) + 1) + 10;

        List<Object> list = new ArrayList<>();

        for(int i = 0; i < count; i++) {
            int tmp = rand.nextInt((3 - 0) + 1) + 0;
            switch (tmp) {
                case 0: {
                    Square obj = new Square();
                    obj.randomPoints();
                    list.add(obj);
                    break;
                }
                case 1: {
                    Circle obj = new Circle();
                    obj.randomPoints();
                    list.add(obj);
                    break;
                }
                case 2: {
                    Trapezoid obj = new Trapezoid();
                    obj.randomPoints();
                    list.add(obj);
                    break;
                }
                case 3: {
                    Triangle obj = new Triangle();
                    obj.randomPoints();
                    list.add(obj);
                    break;
                }
            }
        }

        for(Object obj : list) {
            if (obj instanceof Trapezoid) {
                Trapezoid tmp = (Trapezoid)obj;
                System.out.println(tmp.print());
            } else if (obj instanceof Square) {
                Square tmp = (Square)obj;
                System.out.println(tmp.print());
            } else if (obj instanceof Circle) {
                Circle tmp = (Circle)obj;
                System.out.println(tmp.print());
            } else if (obj instanceof Triangle) {
                Triangle tmp = (Triangle)obj;
                System.out.println(tmp.print());
            }
        }
    }
}
