
import java.util.Scanner;

public class AnalizadorCalificaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Numero de alumnos: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Al menos un alumno.");
            sc.close();
            return;
        }
        double[] calificaciones = new double[n];
        double suma = 0;
        double mayor = -Double.MAX_VALUE;
        double menor = Double.MAX_VALUE;
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            double cal = sc.nextDouble();
            calificaciones[i] = cal;
            suma += cal;
            if (cal > mayor) {
                mayor = cal;
            }
            if (cal < menor) {
                menor = cal;
            }
            if (cal >= 6) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        double promedio = suma / n;
        double porcentajeAprobacion = (aprobados * 100.0) / n;
        System.out.println("\n Resultados por alumno ");

        for (int i = 0; i < n; i++) {
            String estado;
            if (calificaciones[i] >= 6) {
                estado = "Aprobado";
            } else {
                estado = "Reprobado";
            }
            System.out.printf(
                "Alumno %d - %.2f - %s%n",
                i + 1,
                calificaciones[i],
                estado
            );
                    }
             System.out.println("\n General ");
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.printf("Mayor: %.2f%n", mayor);
        System.out.printf("Menor: %.2f%n", menor);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.printf(
            "Porcentaje aprobacion: %.2f%%%n",
            porcentajeAprobacion
        );

        sc.close();
    }
}


