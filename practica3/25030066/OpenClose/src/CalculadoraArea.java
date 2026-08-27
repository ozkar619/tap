//Mal Ejemplo

public class CalculadoraArea {

    public double calcularArea(String figura, double valor1, double valor2) {

        if (figura.equals("circulo")) {
            return Math.PI * valor1 * valor1;

        } else if (figura.equals("cuadrado")) {
            return valor1 * valor1;

        } else if (figura.equals("rectangulo")) {
            return valor1 * valor2;

        } else {
            return 0;
        }
    }
}