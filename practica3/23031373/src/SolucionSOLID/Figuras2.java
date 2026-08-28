package SolucionSOLID;

public class Figuras2 {

    interface Figura {
        double calcularArea();
    }

    class Rectangulo implements Figura {
        public double base;
        public double altura;

        @Override
        public double calcularArea() {
            return base * altura;
        }
    }

    class Circulo implements Figura {
        public double radio;

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

    class CalculadoraDeAreas {
        // Este método ya nunca tendrá que ser modificado
        public double calcularArea(Figura figura) {
            return figura.calcularArea();
        }
    }
}
