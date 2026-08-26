import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Escribe el nombre del alumno: ");
        String nombre = leer.nextLine();

        System.out.print("¿Cuántas materias son?: ");
        int materias = leer.nextInt();

        double suma = 0;
        for (int i = 1; i <= materias; i++) {
            System.out.print("Calificacion " + i + ": ");
            double calificacion = leer.nextDouble();
            suma = suma + calificacion;
        }

        PromedioAlumno promedioAlumno = new PromedioAlumno();
        double promedio = promedioAlumno.calcular(suma, materias);

        ReporteAlumno reporteAlumno = new ReporteAlumno();
        String reporte = reporteAlumno.generar(nombre, promedio);

        System.out.println("--- RESULTADOS ---");
        System.out.println(reporte);

        Archivo archivo = new Archivo();
        archivo.guardar(reporte);

        Correo correo = new Correo();
        correo.enviar(reporte);
    }
}