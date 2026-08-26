import java.io.FileWriter;
import java.io.IOException;

 public class GestorArchivos {
    public void guardarReporte(Alumno alumno, double promedio) {

        try {

            FileWriter archivo = new FileWriter("reporte.txt");

            archivo.write(" REPORTE DEL ALUMNO \n");
            archivo.write("Nombre: " + alumno.nombre + "\n");
            archivo.write("Calificacion 1: " + alumno.calificacion1 + "\n");
            archivo.write("Calificacion 2: " + alumno.calificacion2 + "\n");
            archivo.write("Calificacion 3: " + alumno.calificacion3 + "\n");
            archivo.write("Promedio: " + promedio + "\n");

            if (promedio >= 6) {
                archivo.write("Estado: APROBADO\n");
            } else {
                archivo.write("Estado: REPROBADO\n");
            }

            archivo.close();

            System.out.println("Reporte guardado correctamente");

        } catch (IOException e) {

            System.out.println("Error al guardar el archivo.");
        }
    }
}
