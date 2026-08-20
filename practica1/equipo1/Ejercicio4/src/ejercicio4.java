import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos productos vas a registrar? ");
        int cantidad = sc.nextInt();

        double subtotal = 0;

        for (int i = 1; i <= cantidad; i++) {

            sc.nextLine();

            System.out.print("Nombre del producto " + i + ": ");
            String nombre = sc.nextLine();

            System.out.print("Precio de " + nombre + ": $");
            double precio = sc.nextDouble();

            subtotal += precio;
        }

        double descuento = 0;

        if (subtotal >= 5000) {
            descuento = subtotal * 0.20;
        } else if (subtotal >= 2000) {
            descuento = subtotal * 0.15;
        } else if (subtotal >= 1000) {
            descuento = subtotal * 0.10;
        }

        double subtotalConDescuento = subtotal - descuento;
        double iva = subtotalConDescuento * 0.16;

        double total = subtotalConDescuento + iva;

        System.out.println("\n----- TICKET -----");
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Descuento: $%.2f%n", descuento);
        System.out.printf("IVA (16%%): $%.2f%n", iva);
        System.out.printf("Total final: $%.2f%n", total);

        sc.close();
    }
}