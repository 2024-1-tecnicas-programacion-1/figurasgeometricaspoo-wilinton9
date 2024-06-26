package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    @Override
    public double obtenerPerimetro() {
        // No se especifica el cálculo del perímetro para un triángulo genérico,
        // ya que podría ser equilátero, isósceles o escaleno.
        return 0;
    }
}
