package com.ejemplo;

import java.util.Scanner;

public class Cajero {
    private Cuenta cuenta;
    private Scanner scanner;

    public Cajero(Cuenta cuenta) {
        this.cuenta = cuenta;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion = 0;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                procesarOpcion(opcion);
            } else {
                System.out.println("Error: Por favor, ingrese un número válido.");
                scanner.next();
            }
            System.out.println();
        } while (opcion != 4);
    }

    private void mostrarMenu() {
        System.out.println("°°°BANCO CAJERO°°°");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                consultarSaldo();
                break;
            case 2:
                depositar();
                break;
            case 3:
                retirar();
                break;
            case 4:
                System.out.println("¡Byeeee!:)");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.:(");
        }
    }

    private void consultarSaldo() {
        System.out.printf("Saldo actual: $%.2f%n", cuenta.getSaldo());
    }

    private void depositar() {
        System.out.print("Ingrese el monto a depositar: $");
        double monto = scanner.nextDouble();

        if (cuenta.depositar(monto)) {
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Error: No se pueden realizar depósitos negativos o iguales a cero.");
        }
        consultarSaldo();
    }

    private void retirar() {
        System.out.print("Ingrese el monto a retirar: $");
        double monto = scanner.nextDouble();

        if (cuenta.retirar(monto)) {
            System.out.println("Retiro realizado.");
        } else {
            if (monto > cuenta.getSaldo()) {
                System.out.println("Fondo insuficiente para completar la transacción.:(");
            } else {
                System.out.println("¡El monto a retirar debe ser mayor a cero!");
            }
        }
        consultarSaldo();
    }
}

