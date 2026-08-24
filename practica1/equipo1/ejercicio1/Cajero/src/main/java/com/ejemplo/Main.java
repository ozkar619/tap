package com.ejemplo;

public class Main {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(30000.00);

        Cajero cajero = new Cajero(miCuenta);
        cajero.iniciar();
    }
}



