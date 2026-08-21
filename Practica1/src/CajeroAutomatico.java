import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 5000.0;
        int opcion = 0;

        System.out.println("Saldo inicial: $" + (int)saldo);

        while (opcion != 4) {
            // Mostrar menú
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("\nSeleccione: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + (int)saldo);
                    break;

                case 2:
                    System.out.print("Cantidad a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("Error: No se aceptan depósitos negativos o iguales a cero.");
                    } else {
                        saldo += deposito;
                        System.out.println("Depósito exitoso.");
                    }
                    System.out.println("Saldo actual: $" + (int)saldo);
                    break;

                case 3:
                    System.out.print("Cantidad a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("Error: Ingrese una cantidad válida para retirar.");
                    } else if (retiro > saldo) {
                        System.out.println("Error: Fondos insuficientes.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso.");
                    }
                    System.out.println("Saldo actual: $" + (int)saldo);
                    break;

                case 4:
                    System.out.println("Gracias por utilizar el cajero automático.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}