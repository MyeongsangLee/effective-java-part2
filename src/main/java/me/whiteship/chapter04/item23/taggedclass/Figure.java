package me.whiteship.chapter04.item23.taggedclass;

public class Figure {

    enum Shape { RECTANGLE, CIRCLE, SQUARE}

    final Shape shape;
    double length;
    double width;

    double radius;

    public Figure(double radius) {
        this.shape = Shape.CIRCLE;
        this.radius = radius;
    }

    public Figure(double length, double width) {
        this.shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (shape) {
            case CIRCLE:
                return Math.PI * (radius * radius);
            case RECTANGLE:
                return length * width;
            default:
                throw new AssertionError(shape);
        }
    }
}
