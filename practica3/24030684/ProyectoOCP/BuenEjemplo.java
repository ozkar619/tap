import java.util.Scanner;

public class BuenEjemplo {

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
        int opcion = sc.nextInt();

        Envio envio;

        if (opcion == 1) {

            envio = new EnvioNormal();

        } else if (opcion == 2) {

            envio = new EnvioExpress();

        } else {

            envio = new EnvioInternacional();
        }

        CalculadoraEnvio calculadora = new CalculadoraEnvio();

        double costo = calculadora.calcularCosto(envio, peso);

        System.out.println("\nEl costo del envío es: $" + costo);

        sc.close();
    }
}


// ================================================
// INTERFAZ
// ================================================

interface Envio {

    double calcularCosto(double peso);
}


// ================================================
// ENVÍO NORMAL
// ================================================

class EnvioNormal implements Envio {

    @Override
    public double calcularCosto(double peso) {

        return peso * 50;
    }
}


// ================================================
// ENVÍO EXPRESS
// ================================================

class EnvioExpress implements Envio {

    @Override
    public double calcularCosto(double peso) {

        return peso * 80;
    }
}


// ================================================
// ENVÍO INTERNACIONAL
// ================================================

class EnvioInternacional implements Envio {

    @Override
    public double calcularCosto(double peso) {

        return peso * 150;
    }
}


// ================================================
// CALCULADORA
// ================================================

class CalculadoraEnvio {

    public double calcularCosto(Envio envio, double peso) {

        return envio.calcularCosto(peso);
    }
}