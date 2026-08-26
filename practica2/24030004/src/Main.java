//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Alumno {
    String nombre;
    double[] calificaciones;

    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
}

class Calculadora {
    public double sacarPromedio(double[] califs) {
        double suma = 0;
        for (int i = 0; i < califs.length; i++) {
            suma = suma + califs[i];
        }
        return suma / califs.length;
    }
}

class CreadorReporte {
    public String hacerReporte(String nombre, double promedio) {
        String texto = "Reporte de calificaciones\n";
        texto = texto + "Alumno: " + nombre + "\n";
        texto = texto + "Promedio: " + promedio + "\n";
        return texto;
    }
}

class GestorDeArchivos {
    public void guardarReporte(String reporte) {
        System.out.println("Simulando guardado en archivo");
        System.out.println(reporte);
        System.out.println("Archivo guardado con exito.");
    }
}

class GestorDeCorreos {
    public void mandarCorreo(String reporte, String correo) {
        System.out.println("--- Simulando envio de correo a " + correo + " ---");
        System.out.println(reporte);
        System.out.println("Correo enviado con exito.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el nombre del alumno: ");
        String nombre = entrada.nextLine();

        System.out.print("Escribe el correo del alumno: ");
        String correo = entrada.nextLine();

        System.out.print("Cuantas calificaciones vas a capturar?: ");
        int cantidad = entrada.nextInt();

        double[] calificaciones = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Escribe la calificacion " + (i + 1) + ": ");
            calificaciones[i] = entrada.nextDouble();
        }

        Alumno alumno = new Alumno(nombre, calificaciones);

        Calculadora calc = new Calculadora();
        double promedio = calc.sacarPromedio(alumno.calificaciones);

        CreadorReporte creador = new CreadorReporte();
        String reporte = creador.hacerReporte(alumno.nombre, promedio);

        System.out.println("\nResultados en pantalla:");
        System.out.println(reporte);

        GestorDeArchivos archivos = new GestorDeArchivos();
        archivos.guardarReporte(reporte);

        GestorDeCorreos correos = new GestorDeCorreos();
        correos.mandarCorreo(reporte, correo);
    }
}