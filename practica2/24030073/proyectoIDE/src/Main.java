import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----- SISTEMA DE ALUMNOS -----");

        System.out.print("Nombre del alumno: ");
        String nombre = scanner.nextLine();

        System.out.print("Correo: ");
        String correo = scanner.nextLine();

        System.out.print("Calificación 1: ");
        double calificacion1 = scanner.nextDouble();

        System.out.print("Calificación 2: ");
        double calificacion2 = scanner.nextDouble();

        // Crear alumno
        Alumno alumno = new Alumno(
                nombre,
                correo,
                calificacion1,
                calificacion2
        );

        // Crear objetos
        CalculadoraPromedio calculadora = new CalculadoraPromedio();
        GeneradorReporte generador = new GeneradorReporte();
        GestorArchivo gestor = new GestorArchivo();

        // --- LO NUEVO: Instanciamos el servicio de correos ---
        Notificacion notificacion = new Notificacion();

        // Calcular promedio
        double promedio = calculadora.calcular(alumno);

        // Generar reporte
        String reporte = generador.generar(alumno, promedio);

        // Mostrar reporte
        System.out.println("\n" + reporte);

        // Guardar reporte
        gestor.guardar(reporte);

        // --- LO NUEVO: Enviamos el correo ---
        notificacion.enviarPorCorreo(alumno, reporte);

        scanner.close();
    }
}