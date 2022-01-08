package Cwiczenia.polymorph;

public class Rectangle implements GeometricFigures {
    private Double a;
    private Double b;

    public Rectangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void calculateField() {
        System.out.println(a * b);
    }
}
