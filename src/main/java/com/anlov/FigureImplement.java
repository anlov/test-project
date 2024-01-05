package com.anlov;

public abstract class FigureImplement implements Figure {
    private final Colors Fill_Color;
    private final Colors borderCol;

    public FigureImplement(Colors Fill_Color, Colors borderCol) {
        this.Fill_Color = Fill_Color;
        this.borderCol = borderCol;
    }

    @Override
    public String toString() {
        return "FigureImplement{" + "Perimeter" + this.getPerimeter() + ";" +
                "Area:" + this.getArea() + ";" +
                "fillColor=" + Fill_Color + ";" +
                "BorderColor=" + borderCol + ";" + "}";
    }
}
