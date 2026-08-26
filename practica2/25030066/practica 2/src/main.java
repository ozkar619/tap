import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("REPORTES");
        System.out.print("Ingresa el nombre del alumno: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la calificacion 1: ");
        double cal1 = scanner.nextDouble();

        System.out.print("Ingresa la calificacion 2: ");
        double cal2 = scanner.nextDouble();
        System.out.println();

        ReporteAlumno alumno = new ReporteAlumno(nombre, cal1, cal2);
        calculadoraPromedio calculadora = new calculadoraPromedio();
        archivo gestorArchivo = new archivo();
        envio gestorEnvio = new envio();
        double promedio = calculadora.calcular(alumno.getCalificacion1(), alumno.getCalificacion2());

        String textoReporte = alumno.generarReporte(promedio);


        System.out.println(textoReporte + "\n");

        gestorArchivo.guardar(textoReporte);
        gestorEnvio.enviarPorCorreo(textoReporte, "25030066@itcelaya.edu.mx");

        scanner.close();
    }
}