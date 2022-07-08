package com.company;

class Square{
    int length;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int areaSq(){
        return this.length*this.length;
    }
}

class Rectangle extends Square{
    int breadth;
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int areaRe(){
        return this.length*this.breadth;
    }
}

class Circle{
    int radius;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double areaC(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder extends Circle{
    int height;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double areaCy(){
        return 2*Math.PI*this.radius*this.height;
    }
    public double volCy(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

class Sphere extends Circle{
    public double volS(){
        return Math.PI*this.radius*this.radius*this.radius;
    }
}
public class CWH_68_ex5 {
    public static void main(String[] args) {

    }

}
