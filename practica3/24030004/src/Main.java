public class Main {
    static class CalculadoraDescuentoMala {
        public double calcular(String tipoCliente, double monto) {
            if (tipoCliente.equals("Regular")) {
                return monto * 0.1;
            } else if (tipoCliente.equals("Vip")) {
                return monto * 0.2;
            }
            return 0;
        }
    }

    interface Descuento {
        double calcular(double monto);
    }

    static class DescuentoRegular implements Descuento {
        public double calcular(double monto) {
            return monto * 0.1;
        }
    }

    static class DescuentoVip implements Descuento {
        public double calcular(double monto) {
            return monto * 0.2;
        }
    }

    static class ProcesadorDeDescuentos {
        public double procesar(Descuento descuento, double monto) {
            return descuento.calcular(monto);
        }
    }

    public static void main(String[] args) {
        CalculadoraDescuentoMala malo = new CalculadoraDescuentoMala();
        System.out.println(malo.calcular("Vip", 1000.0));

        ProcesadorDeDescuentos bueno = new ProcesadorDeDescuentos();
        System.out.println(bueno.procesar(new DescuentoVip(), 1000.0));
    }
}