public class BuenEjemplo {
    interface Descuento {
        double calcular(double precio);
    }
    class Estudiante implements Descuento {
        public double calcular(double precio) {
            return precio * 0.90;
        }
    }
    class Maestro implements Descuento {
        public double calcular(double precio) {
            return precio * 0.80;

        }
    }
}
