package com.anlov;

public class Square  extends FigureImplement {
    private final double Side_Length;

    public Square(Colors fillColor, Colors borderCol, int Side_Length) {
        super(fillColor, borderCol);
        this.Side_Length = Side_Length;
    }
    @Override
    public double getPerimeter() {
        return Side_Length * 4;
    }

    @Override
    public double getArea() {
        return Side_Length * Side_Length;
    }
}

