package com.ejemplo;

public class Promedio {

    private String nombre;
    private double calif1;
    private double calif2;

    public Promedio(String nombre, double calif1, double calif2) {
        this.nombre = nombre;
        this.calif1 = calif1;
        this.calif2 = calif2;
    }
    public double calcularProm(){
        return (calif1+calif2)/2; }

    public String getNombre(){
        return nombre;
    }
}
