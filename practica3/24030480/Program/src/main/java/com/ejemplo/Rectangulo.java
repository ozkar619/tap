package com.ejemplo;

// Creamos la clase Rectangulo que implementa la interfaz IFigura
public class Rectangulo implements IFigura {
    private final double ancho;
    private final double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
