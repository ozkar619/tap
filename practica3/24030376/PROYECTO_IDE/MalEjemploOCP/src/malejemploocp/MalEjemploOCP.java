package malejemploocp;

public class MalEjemploOCP {

    // Clase que calcula el salario
    static class CalculadoraSalario {

        public double calcularSalario(String tipoEmpleado, double salario) {

            if (tipoEmpleado.equals("TIEMPO_COMPLETO")) {
                return salario;

            } else if (tipoEmpleado.equals("MEDIO_TIEMPO")) {
                return salario * 0.5;

            } else if (tipoEmpleado.equals("POR_COMISION")) {
                return salario + 1000;

            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {

        CalculadoraSalario calculadora = new CalculadoraSalario();

        double salario1 = calculadora.calcularSalario(
                "TIEMPO_COMPLETO", 10000);

        double salario2 = calculadora.calcularSalario(
                "MEDIO_TIEMPO", 10000);

        double salario3 = calculadora.calcularSalario(
                "POR_COMISION", 10000);

        System.out.println("=== CALCULO DE SALARIOS ===");

        System.out.println("Empleado de tiempo completo: $" + salario1);
        System.out.println("Empleado de medio tiempo: $" + salario2);
        System.out.println("Empleado por comisión: $" + salario3);
    }
}