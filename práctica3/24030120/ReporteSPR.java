import java.util.Scanner;
class Alumno {
    String nombre;
    int[] calificaciones;

    public Alumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        var sumarPromedio = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            sumarPromedio += calificaciones[i];
        }
        return calificaciones.length > 0 ? (double) sumarPromedio / calificaciones.length : 0;
    }
}

class ReporteService {
    public void mostrarReporte(Alumno alumno, double promedio) {
        System.out.println("promedio de calificaciones: " + promedio);
    }
}

class EnvioService {
    public void guardarYEnviar() {
        System.out.println("Reporte logrado");
        System.out.println("Reporte guardado y enviado por correo ");
    }
}

public class ReporteSPR {
    public static void main(String[] args) {
        System.out.println("***Promedio de calificaciones***");
        var consola = new Scanner(System.in);

        System.out.println("Digite el nombre del alumno");
        var nombre = consola.nextLine();

        System.out.print("Cuantas calificaciones desea agregar de " + nombre + "?");
        var totalCalifi = Integer.parseInt(consola.nextLine());

        int[] calificaciones = new int[totalCalifi];
        for (int i = 0; i < totalCalifi; i++) {
            System.out.print("Calificacion [" + i + "] = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }

        Alumno alumno = new Alumno(nombre, calificaciones);
        double promedio = alumno.calcularPromedio();

        ReporteService reporte = new ReporteService();
        EnvioService envio = new EnvioService();

        if (promedio > 0) {
            reporte.mostrarReporte(alumno, promedio);
            envio.guardarYEnviar();
        } else {
            System.out.println("Error del sistema");
        }
    }
}
