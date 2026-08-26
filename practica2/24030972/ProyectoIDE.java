import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre del alumno: ");
        String nombre = entrada.nextLine();

        System.out.print("Matricula: ");
        String matricula = entrada.nextLine();

        System.out.print("Calificacion 1: ");
        double calificacion1 = entrada.nextDouble();

        System.out.print("Calificacion 2: ");
        double calificacion2 = entrada.nextDouble();

        System.out.print("Calificacion 3: ");
        double calificacion3 = entrada.nextDouble();

        Alumno alumno = new Alumno(
                nombre,
                matricula,
                calificacion1,
                calificacion2,
                calificacion3
        );

        CalculadoraPromedio calculadora = new CalculadoraPromedio();

        double promedio = calculadora.calcularPromedio(alumno);

        System.out.println("\nPromedio: " + promedio);

        GeneradorReporte generador = new GeneradorReporte();

        String reporte = generador.generarReporte(alumno, promedio);

        System.out.println("\n" + reporte);

        GestorArchivo archivo = new GestorArchivo();

        archivo.guardarArchivo(reporte);

        EnviadorCorreo correo = new EnviadorCorreo();

        correo.enviarCorreo(reporte);

        entrada.close();
    }
}

public class Alumno {

    private String nombre;
    private String matricula;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    public Alumno(String nombre, String matricula, double calificacion1, double calificacion2, double calificacion3) {

        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getCalificacion1() {
        return calificacion1;
    }

    public double getCalificacion2() {
        return calificacion2;
    }

    public double getCalificacion3() {
        return calificacion3;
    }
}

public class CalculadoraPromedio {

    public double calcularPromedio(Alumno alumno) {

        return (alumno.getCalificacion1()
                + alumno.getCalificacion2()
                + alumno.getCalificacion3()) / 3;
    }
}

public class GeneradorReporte {

    public String generarReporte(Alumno alumno, double promedio) {

        String reporte = "";

        reporte += "Nombre: " + alumno.getNombre() + "\n";
        reporte += "Matricula: " + alumno.getMatricula() + "\n";
        reporte += "Calificacion 1: " + alumno.getCalificacion1() + "\n";
        reporte += "Calificacion 2: " + alumno.getCalificacion2() + "\n";
        reporte += "Calificacion 3: " + alumno.getCalificacion3() + "\n";
        reporte += "Promedio: " + promedio + "\n";

        return reporte;
    }
}

import java.io.FileWriter;
import java.io.IOException;

public class GestorArchivo {

    public void guardarArchivo(String reporte) {

        try {
            FileWriter archivo = new FileWriter("reporte_alumno.txt");

            archivo.write(reporte);

            archivo.close();

            System.out.println("Reporte guardado correctamente");

        } catch (IOException e) {

            System.out.println("Error al guardar el archivo");
        }
    }
}

public class EnviadorCorreo {

    public void enviarCorreo(String reporte) {

        System.out.println("Enviando reporte por correo");
        System.out.println("Reporte enviado correctamente");
    }
}
