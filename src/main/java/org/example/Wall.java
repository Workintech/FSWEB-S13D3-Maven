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

    public void setWidth(double width){
        if(width > 0){
            this.width = width;
        }
        else{
            this.width = 0;
        }
    }

    public void setHeight(double height){
        if(height > 0){
            this.height = height;
        }
        else{
            this.height = 0;
        }
    }

    public double getArea(){
        return this.width * this.height;
    }
}