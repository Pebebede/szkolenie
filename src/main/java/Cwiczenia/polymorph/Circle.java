package Cwiczenia.polymorph;

public class Circle implements GeometricFigures {
    double radius;
    private final Double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public void calculateField() {
        System.out.println(pi * radius * radius);
    }


}
