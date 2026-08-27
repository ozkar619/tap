package com.mycompany.descuento1;

interface Descuento {
    double aplicar(double precio);
}
class DescuentoNormal implements Descuento {
    public double aplicar(double precio) {
        return precio; 
    }
}
class DescuentoPremium implements Descuento {
    public double aplicar(double precio) {
        return precio * 0.90; 
    }
}
class DescuentoVIP implements Descuento {  
    public double aplicar(double precio) {
        return precio * 0.80;
    }
}
class DescuentoEstudiante implements Descuento {
    public double aplicar(double precio) {
        return precio * 0.85;
    }
}
class CalculadoraDescuento {
    public double calcular(Descuento descuento, double precio) {
        return descuento.aplicar(precio);
    }
}
public class Descuento1 {
    public static void main(String[] args) {
        CalculadoraDescuento calculadora = new CalculadoraDescuento();
        System.out.println(calculadora.calcular(new DescuentoNormal(), 200));     
        System.out.println(calculadora.calcular(new DescuentoPremium(), 500));    
        System.out.println(calculadora.calcular(new DescuentoVIP(), 650));        
        System.out.println(calculadora.calcular(new DescuentoEstudiante(), 300)); 
    }
}