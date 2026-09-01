package com.ejemplo;

// Agregamos la clase Triangulo implementando IFigura
public class Triangulo implements IFigura {
    private final double baseT;
    private final double altura;

    public Triangulo(double baseT, double altura) {
        this.baseT = baseT;
        this.altura = altura;
    }

    public double getBaseT() {
        return baseT;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return (baseT * altura) / 2;
    }
}
