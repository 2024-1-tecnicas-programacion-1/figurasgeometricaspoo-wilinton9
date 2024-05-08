package com.mycompany.figurasgeometricaspoo;

public class FiguraGeometrica {
    private String nombre;
    private String color;

    // Constructor
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter para color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Métodos abstractos para obtener el área y el perímetro
    public double obtenerArea() {
        // Este método se implementará en las subclases
        return 0.0;
    }

    public double obtenerPerimetro() {
        // Este método se implementará en las subclases
        return 0.0;
    }
}
