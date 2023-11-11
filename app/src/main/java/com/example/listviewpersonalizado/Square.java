package com.example.listviewpersonalizado;

// Square.java
public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

// Pentágono, Triángulo Isósceles y Rectángulo deberían tener estructuras similares
