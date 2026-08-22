
package cajero;

import java.util.Scanner;


class CuentaBancaria {
   
    private double saldo;

   
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

   
    public double consultarSaldo() {
        return this.saldo;
    }

   
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Deposito exitoso.");
        } else {
            System.out.println("Error: No se aceptan depositos negativos o en ceros.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > this.saldo) {
            System.out.println("Error: No se puede retirar mas dinero del saldo disponible.");
        } else if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser mayor a 0.");
        } else {
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso.");
        }
    }
}


public class Cajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        CuentaBancaria cuenta = new CuentaBancaria(5000.0);
        int opcion = 0;

        System.out.println("Saldo inicial: $" + cuenta.consultarSaldo());

        while (opcion != 4) {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");
            
            opcion = scanner.nextInt();

           
            switch (opcion) {
                case 1:
                   
                    break;
                case 2:
                    System.out.print("Cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Cantidad: ");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automatico.");
                    break;
                default:
                    System.out.println("Opción no valida. Intente de nuevo.");
                    break;
            }

          
            if (opcion >= 1 && opcion <= 3) {
                System.out.println("Saldo actual: $" + cuenta.consultarSaldo());
            }
        }
        
        scanner.close();
    }
}