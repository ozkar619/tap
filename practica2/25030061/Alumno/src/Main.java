    //TIP To <b>Run</b > code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            GestorAlumnos gestor = new GestorAlumnos();
            CalculadoraCalificaciones calculadora =
                    new CalculadoraCalificaciones();
            GeneradorReporte reporte =
                    new GeneradorReporte();
            GestorArchivos archivos =
                    new GestorArchivos();


            System.out.println("    SISTEMA DE ALUMNOS");


            System.out.print("Nombre del alumno: ");
            String nombre = teclado.nextLine();

            System.out.print("Calificacion 1: ");
            double calificacion1 = teclado.nextDouble();

            System.out.print("Calificacion 2: ");
            double calificacion2 = teclado.nextDouble();

            System.out.print("Calificacion 3: ");
            double calificacion3 = teclado.nextDouble();


            Alumno alumno = gestor.agregarAlumno(
                    nombre,
                    calificacion1,
                    calificacion2,
                    calificacion3
            );


            double promedio =
                    calculadora.calcularPromedio(alumno);


            reporte.generarReporte(alumno, promedio);


            archivos.guardarReporte(alumno, promedio);

            teclado.close();
        }
    }