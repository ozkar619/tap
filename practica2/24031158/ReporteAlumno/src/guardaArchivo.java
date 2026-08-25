import java.io.*;
public class guardaArchivo {
    void guardaArchivo(String cve, String prom, String dat)
    {
        System.out.println("Ingresa el numero de reporte");
        String rep= (cve);
        File file = new File(rep);
        try {
            if (file.createNewFile()) {
                System.out.println("Reporte creado: " + file.getName());
            } else {
                System.out.println("El reporte ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        //Ingresar datos al archivo
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("\n"+dat+"\n"+prom);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
