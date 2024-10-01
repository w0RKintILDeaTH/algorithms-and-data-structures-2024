package ru.mirea.practice.s23k0116.task1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle: \nwidth: " + width
                + "\n" + "height" + height
                + "\n" + "Area: " + getArea()
                + "\n" + "Perimeter: " + getPerimeter();
    }
}