import java.util.Scanner;

class CalculadoraPromedio {
    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return calificaciones.length > 0 ? (suma / calificaciones.length) : 0;
    }
}

class GeneradorReporte {
    public String crearReporte(String nombre, double promedio) {
        return "=================================\n" +
                "       REPORTE DE ALUMNO         \n" +
                "=================================\n" +
                "Nombre: " + nombre + "\n" +
                "Promedio Final: " + promedio + "\n" +
                "=================================\n";
    }
}

class GestorArchivos {
    public void guardarArchivo(String contenido, String nombreArchivo) {
        System.out.println("\n[SISTEMA] -> Guardando el reporte en el archivo: " + nombreArchivo + ".txt...");
        System.out.println("[SISTEMA] -> ¡Archivo guardado exitosamente!");
    }
}

class GestorCorreos {
    public void enviarCorreo(String destinatario, String contenido) {
        System.out.println("[SISTEMA] -> Enviando reporte al correo: " + destinatario + "...");
        System.out.println("[SISTEMA] -> ¡Correo enviado exitosamente!\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- SISTEMA DE GESTIÓN DE ALUMNOS (SOLID) ---");
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese el correo del alumno: ");
        String correo = teclado.nextLine();

        System.out.print("¿Cuántas calificaciones desea ingresar?: ");
        int cantidad = teclado.nextInt();
        double[] calificaciones = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = teclado.nextDouble();
        }

        CalculadoraPromedio calc = new CalculadoraPromedio();
        double promedio = calc.calcularPromedio(calificaciones);

        GeneradorReporte generador = new GeneradorReporte();
        String reporteFinal = generador.crearReporte(nombre, promedio);

        System.out.println("\n" + reporteFinal);

        GestorArchivos gestorArchivos = new GestorArchivos();
        gestorArchivos.guardarArchivo(reporteFinal, nombre.replace(" ", "_"));

        GestorCorreos gestorCorreos = new GestorCorreos();
        gestorCorreos.enviarCorreo(correo, reporteFinal);

        teclado.close();
    }
}