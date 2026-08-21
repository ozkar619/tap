import java.util.Scanner;

public class calculadoraSuper {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite la cantidad de productos: ");
        int productos = Integer.parseInt(entrada.nextLine());

        float sumaProductos = 0;

        for (int i = 0; i < productos; i++) {
            System.out.println("Digite el precio del producto: ");
            float precio = Float.parseFloat(entrada.nextLine());
            sumaProductos += precio;
        }

        float descuento = 0;
        if (sumaProductos >= 5000) {
            descuento = sumaProductos * 0.20f;
        } else if (sumaProductos >= 2000) {
            descuento = sumaProductos * 0.15f;
        } else if (sumaProductos >= 1000) {
            descuento = sumaProductos * 0.10f;
        }

        float subtotalConDescuento = sumaProductos - descuento;
        float iva = subtotalConDescuento * 0.16f;
        float total = subtotalConDescuento + iva;

        System.out.println("Subtotal: $" + sumaProductos);
        System.out.println("IVA: $" + iva);
        System.out.println("Total: $" + total);
    }
}
