package com.anlov;

public class Triangle extends FigureImplement {
    private final double FIRST_SIDE;
    private final double SECOND_SIDE;
    private final double THIRD_SIDE;

    public Triangle(Colors Fill_Color, Colors borderCol, double FIRST_SIDE, double SECOND_SIDE, double THIRD_SIDE ) {
        super(Fill_Color, borderCol);
        this.FIRST_SIDE = FIRST_SIDE;
        this.SECOND_SIDE = SECOND_SIDE;
        this.THIRD_SIDE = THIRD_SIDE;
    }

    @Override
    public double getPerimeter() {
        return FIRST_SIDE + SECOND_SIDE + THIRD_SIDE;
    }

    @Override
    public double getArea() {
        double perimeter = (this.getPerimeter()) / 2;
        return Math.sqrt(perimeter * (perimeter - FIRST_SIDE) * (perimeter - SECOND_SIDE) * (perimeter - THIRD_SIDE));
    }
}
