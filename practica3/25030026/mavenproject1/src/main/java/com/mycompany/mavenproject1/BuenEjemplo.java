package com.mycompany.mavenproject1;

interface ReglaDeDescuento {
    double calcular(double precio);
}
class DescuentoRegular implements ReglaDeDescuento {
    @Override
    public double calcular(double precio) {
        return precio * 0.95; 
    }
}

class DescuentoPremium implements ReglaDeDescuento {
    @Override
    public double calcular(double precio) {
        return precio * 0.90; 
    }
}

class DescuentoVIP implements ReglaDeDescuento {
    @Override
    public double calcular(double precio) {
        return precio * 0.80; 
    }
}

class CalculadoraDeDescuentos {
    // Ahora la calculadora no necesita saber qué tipo de cliente es, 
    // solo sabe que la regla que le pasen tiene un método "calcular()".
    public double calcular(ReglaDeDescuento regla, double precio) {
        return regla.calcular(precio);
    }
}

public class BuenEjemplo {
    
    public static void main(String[] args) {
        CalculadoraDeDescuentos calculadora = new CalculadoraDeDescuentos();
        double precioOriginal = 250;
        
        System.out.println("Precio original: $" + precioOriginal);
        
        double totalRegular = calculadora.calcular(new DescuentoRegular(), precioOriginal);
        System.out.println("Total para cliente Regular: $" + totalRegular);      
        
        double totalPremium = calculadora.calcular(new DescuentoPremium(), precioOriginal);
        System.out.println("Total para cliente Premium: $" + totalPremium);
        
        double totalVIP = calculadora.calcular(new DescuentoVIP(), precioOriginal);
        System.out.println("Total para cliente VIP: $" + totalVIP);
    }
}