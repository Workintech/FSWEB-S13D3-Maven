package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public double setWidth(double width){
        if(width > 0){
            this.width = width;
        }
        else{
            this.width = 0;
        }
        return width;
    }

    public double setHeight(double height){
        if(height > 0){
            this.height = height;
        }
        else{
            this.height = 0;
        }
        return height;
    }

    public double getArea(){
        return this.width * this.height;
    }
}
