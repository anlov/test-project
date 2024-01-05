package com.anlov;

public class Circle extends FigureImplement {
    private final double radiusCircle;

    public Circle(Colors fillColor, Colors borderCol, double radiusCircle) {
        super(fillColor, borderCol);
        this.radiusCircle = radiusCircle;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radiusCircle * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radiusCircle * radiusCircle;
    }
}
