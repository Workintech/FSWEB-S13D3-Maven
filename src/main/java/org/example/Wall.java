package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height) {
        this.height = (height < 0) ? 0 : height;
        this.width = (width < 0) ? 0 : width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;

    }

    public double setWidth(double width) {

        return this.width = (width < 0) ? 0 : width;
    }

    public double setHeight(double height) {
       return this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {

        return this.height * this.width;
    }

}
