//Main MalEjemplo
public class Main {

    public static void main(String[] args) {

        CalculadoraArea calculadora = new CalculadoraArea();

        System.out.println("Área del círculo: "
                + calculadora.calcularArea("circulo", 5, 0));

        System.out.println("Área del cuadrado: "
                + calculadora.calcularArea("cuadrado", 5, 0));

        System.out.println("Área del rectángulo: "
                + calculadora.calcularArea("rectangulo", 5, 10));
    }
}