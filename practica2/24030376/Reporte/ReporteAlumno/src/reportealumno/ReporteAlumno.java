package reportealumno;
import java.util.Scanner;

public class ReporteAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nombreAlumno nom = new nombreAlumno();
        Promedio prom = new Promedio();
        Reporte repor = new Reporte();
        Archivo arch = new Archivo();
        Correo correo = new Correo();

        System.out.print("Introduce el nombre del alumno: ");
        String nombreObtenido = nom.leerAlumno(sc);
        double promedioObtenido = prom.calcularPromedio(sc);
        repor.generarReporte(nombreObtenido, promedioObtenido);
        String mensajeArchivo = arch.guardarArchivo();
        System.out.println(mensajeArchivo);
        String mensajeCorreo = correo.enviarCorreo();
        System.out.println(mensajeCorreo);
    }
}

class nombreAlumno {
    public String leerAlumno(Scanner sc) {
        String nombre = sc.nextLine();
        return nombre;
    }
}

class Promedio {
    public double calcularPromedio(Scanner sc) {
        double[] numeros = new double[4];
        double suma = 0.0;
        double promedio;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce la calificacion " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }
        promedio = suma / numeros.length;
        return promedio;
    }
}

class Reporte {
    public void generarReporte(String nombre, double promedio) {
        System.out.println("REPORTE DEL ALUMNO");
        System.out.println("Alumno: " + nombre);
        System.out.println("Promedio Final: " + promedio);
    }
}

class Archivo {
    public String guardarArchivo() {
        String msj = "Archivo guardado";
        return msj;
    }
}

class Correo {
    public String enviarCorreo() {
        String msj2 = "Correo Enviado";
        return msj2;
    }
}