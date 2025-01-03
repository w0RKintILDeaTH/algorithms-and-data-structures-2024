package ru.mirea.practice.s23k0135.task8;

public abstract class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rect = new Rectangle(10, 15);
        Square square = new Square(20);

        Shape[] shapes = {circle, rect, square};

        for (Shape shape : shapes) {
            System.out.printf("%s Perimeter: %f Area: %f\n", shape, shape.getPerimeter(), shape.getArea());
        }
    }
}
