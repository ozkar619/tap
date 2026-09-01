package com.ejemplo;

// Creamos la clase Circulo que implementa la interfaz IFigura
public class Circulo implements IFigura {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
