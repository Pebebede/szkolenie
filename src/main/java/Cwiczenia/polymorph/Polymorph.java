package Cwiczenia.polymorph;

public class Polymorph {
    public static void main(String[] args) {
        GeometricFigures circle = new Circle(12.5);
        GeometricFigures rectangle = new Rectangle(10.0, 5.0);

        circle.calculateField();
        rectangle.calculateField();
    }

  
}
