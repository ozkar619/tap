import java.util.Scanner;

public class MalEjemplo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SISTEMA DE ENVÍOS =====");

        System.out.print("Ingresa el peso del paquete: ");
        double peso = sc.nextDouble();

        System.out.println("\nTipos de envío:");
        System.out.println("1. Normal");
        System.out.println("2. Express");
        System.out.println("3. Internacional");

        System.out.print("Selecciona una opción: ");
        int tipo = sc.nextInt();

        CalculadoraEnvio calculadora = new CalculadoraEnvio();

        double costo = calculadora.calcularCosto(peso, tipo);

        System.out.println("\nEl costo del envío es: $" + costo);

        sc.close();
    }
}


class CalculadoraEnvio {

    public double calcularCosto(double peso, int tipo) {

        if (tipo == 1) {

            return peso * 50;

        } else if (tipo == 2) {

            return peso * 80;

        } else if (tipo == 3) {

            return peso * 150;

        } else {

            return 0;
        }
    }
}