package com.mycompany.calculadoradescuento2;

class CalculadoraDescuento {

    public double aplicarDescuento(String tipoCliente, double precio) {
        if (tipoCliente.equals("Normal")) {
            return precio; 
        } else if (tipoCliente.equals("Premium")) {
            return precio * 0.90; 
        } else if (tipoCliente.equals("VIP")) {
            return precio * 0.80; 
        } else if (tipoCliente.equals("Estudiante")) {
            return precio * 0.85; 
        }
        return precio;
    }
}

public class CalculadoraDescuento2 {
    public static void main(String[] args) {
        CalculadoraDescuento calculadora = new CalculadoraDescuento();

        System.out.println(calculadora.aplicarDescuento("Normal", 200));     
        System.out.println(calculadora.aplicarDescuento("Premium", 500));    
        System.out.println(calculadora.aplicarDescuento("VIP", 650));        
        System.out.println(calculadora.aplicarDescuento("Estudiante", 300)); 
    }
}