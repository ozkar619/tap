package com.ejemplo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creamos un círculo con radio 5
        Circulo circulo = new Circulo(5);
        System.out.println("El área del círculo es: " + circulo.calcularArea());

        // Creamos un rectángulo de 4x6
        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());

        // Creamos un triángulo de base 3 y altura 4
        Triangulo triangulo = new Triangulo(3, 4);
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());
    }
}