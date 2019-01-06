package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures = new ArrayList<>();


    public void addFigure(Shape shape) {

        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public String getFigure(int n) {

        String figure = "";
        if (n >= 0) figure = figures.get(n).toString();
        return figure;
    }

    public String showFigures() {
        String listOfFigures = "";
        if (figures.size() != 0) {
            for (int i = 0; i < figures.size() - 1; i++) {
                listOfFigures += figures.get(i) + ", ";
            }
            listOfFigures += figures.get(figures.size() - 1);
        }
        return listOfFigures;
    }
}
