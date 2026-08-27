public class MainBien {

    public static void main(String[] args) {

        Figura circulo = new Circulo(5);
        Figura cuadrado = new Cuadrado(5);
        Figura rectangulo = new Rectangulo(5, 10);
        Figura triangulo = new Triangulo(10, 5);

        System.out.println("Área del círculo: "
                + circulo.calcularArea());

        System.out.println("Área del cuadrado: "
                + cuadrado.calcularArea());

        System.out.println("Área del rectángulo: "
                + rectangulo.calcularArea());

        System.out.println("Área del triángulo: "
                + triangulo.calcularArea());
    }
}