import java.util.Scanner;

public class Ejercicio7Estacionamiento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la placa del vehículo: ");
        String placa = teclado.nextLine();

        System.out.print("Ingrese las horas utilizadas: ");
        int horas = teclado.nextInt();


        if (horas <= 0) {
            System.out.println("Error: Las horas deben ser mayores a 0.");
            return;
        }

        System.out.println("\n--- TIPOS DE VEHÍCULO ---");
        System.out.println("1. Automóvil");
        System.out.println("2. Motocicleta");
        System.out.println("3. Camioneta");
        System.out.print("Seleccione el número de su vehículo (1/2/3): ");
        int tipoVehiculo = teclado.nextInt();


        generarTicket(placa, horas, tipoVehiculo);

    }


    public static void generarTicket(String placa, int horas, int tipoVehiculo) {
        double primera = 0, segunda = 0, tercera = 0, adicionales = 0;


        if (horas >= 1) primera = 20;
        if (horas >= 2) segunda = 15;
        if (horas >= 3) tercera = 15;
        if (horas > 3) adicionales = (horas - 3) * 10;

        double subtotal = primera + segunda + tercera + adicionales;
        double totalFinal = subtotal;
        String tipoTexto = "";

        switch (tipoVehiculo) {
            case 1:
                tipoTexto = "Automóvil (Tarifa Normal)";
                totalFinal = subtotal;
                break;
            case 2:
                tipoTexto = "Motocicleta (50% de descuento)";
                totalFinal = subtotal * 0.50;
                break;
            case 3:
                tipoTexto = "Camioneta (25% extra)";
                totalFinal = subtotal * 1.25;
                break;
            default:
                tipoTexto = "Desconocido (Tarifa Normal)";
                totalFinal = subtotal;
                break;
        }

        System.out.println("\n------ ESTACIONAMIENTO ------");
        System.out.println("Placa: " + placa);
        System.out.println("Tipo: " + tipoTexto);
        System.out.println("Horas: " + horas);
        System.out.println();

        if (horas >= 1) System.out.println("Primera hora: $" + (int)primera);
        if (horas >= 2) System.out.println("Segunda hora: $" + (int)segunda);
        if (horas >= 3) System.out.println("Tercera hora: $" + (int)tercera);
        if (horas > 3) System.out.println("Horas adicionales: $" + (int)adicionales);

        System.out.println("SUBTOTAL: $" + subtotal);
        System.out.println("TOTAL FINAL: $" + totalFinal);
    }
}