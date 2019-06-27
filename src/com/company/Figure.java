package com.company;

import java.util.Random;

class Figure {
    protected String color;

    Figure() {
        this.color = this.randColor();
    }

    protected String randColor() {
        Random rand = new Random();
        String[] randColor = {"transparent", "white", "black", "yellow", "green", "blue", "red"};
        int index = rand.nextInt((6 - 0) + 1) + 0;
        return randColor[index];
    }

    public String getColor() {
        return this.color;
    }
}