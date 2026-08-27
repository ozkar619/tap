package buenejemploocp;

public class BuenEjemploOCP {

    // Interfaz que define el comportamiento de un empleado
    interface Empleado {

        double calcularSalario();
    }

    // Empleado de tiempo completo
    static class EmpleadoTiempoCompleto implements Empleado {

        private double salario;

        public EmpleadoTiempoCompleto(double salario) {
            this.salario = salario;
        }

        @Override
        public double calcularSalario() {
            return salario;
        }
    }

    // Empleado de medio tiempo
    static class EmpleadoMedioTiempo implements Empleado {

        private double salario;

        public EmpleadoMedioTiempo(double salario) {
            this.salario = salario;
        }

        @Override
        public double calcularSalario() {
            return salario * 0.5;
        }
    }

    // Empleado por comisión
    static class EmpleadoPorComision implements Empleado {

        private double salario;

        public EmpleadoPorComision(double salario) {
            this.salario = salario;
        }

        @Override
        public double calcularSalario() {
            return salario + 1000;
        }
    }

    // Nuevo tipo de empleado
    // No necesitamos modificar las clases anteriores
    static class EmpleadoPorHoras implements Empleado {

        private double salario;

        public EmpleadoPorHoras(double salario) {
            this.salario = salario;
        }

        @Override
        public double calcularSalario() {
            return salario * 0.8;
        }
    }

    // Calculadora de salarios
    static class CalculadoraSalario {

        public double calcular(Empleado empleado) {
            return empleado.calcularSalario();
        }
    }

    public static void main(String[] args) {

        CalculadoraSalario calculadora = new CalculadoraSalario();

        Empleado empleado1 =
                new EmpleadoTiempoCompleto(10000);

        Empleado empleado2 =
                new EmpleadoMedioTiempo(10000);

        Empleado empleado3 =
                new EmpleadoPorComision(10000);

        Empleado empleado4 =
                new EmpleadoPorHoras(10000);

        System.out.println("=== CALCULO DE SALARIOS ===");

        System.out.println(
                "Empleado de tiempo completo: $"
                        + calculadora.calcular(empleado1));

        System.out.println(
                "Empleado de medio tiempo: $"
                        + calculadora.calcular(empleado2));

        System.out.println(
                "Empleado por comisión: $"
                        + calculadora.calcular(empleado3));

        System.out.println(
                "Empleado por horas: $"
                        + calculadora.calcular(empleado4));
    }
}