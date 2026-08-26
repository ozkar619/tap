import java.io.FileWriter;
import java.io.IOException;

public class GestorArchivo {

    public void guardar(String reporte) {

        try {

            FileWriter archivo = new FileWriter("reportes_alumnos.txt", true);

            archivo.write(reporte + "\n\n");

            archivo.close();

            System.out.println("Reporte guardado correctamente.");

        } catch (IOException e) {

            System.out.println("Error al guardar el archivo.");
        }
    }
}