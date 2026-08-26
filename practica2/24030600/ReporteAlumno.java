
import java.util.Scanner;

public class ReporteAlumno {

    public static void main(String[] args) {
        ingrDatos datos = new ingrDatos();
        realCalculos calculos = new realCalculos();
        repoResultados resultados = new repoResultados();

        datos.m_IngDatos(calculos, resultados);
    }

}

class ingrDatos {
    private String nombre;
    private int cal1, cal2, cal3;
    Scanner sc = new Scanner(System.in);

    public void m_IngDatos(realCalculos cali, repoResultados rest) {
        System.out.println("Ingresa nombre: ");
        this.nombre = sc.next();
        System.out.println("Ingresa calificacion 1: ");
        this.cal1 = sc.nextInt();
        System.out.println("Ingresa calificacion 2: ");
        this.cal2 = sc.nextInt();
        System.out.println("Ingresa calificacion 3: ");
        this.cal3 = sc.nextInt();

        cali.calcular(this.nombre, this.cal1, this.cal2, this.cal3, rest);
    }
}

class realCalculos {
    private double promedio;

    public void calcular(String nombre, int cal1, int cal2, int cal3, repoResultados rest) {
        promedio = (cal1 + cal2 + cal3) / 3.0;
        rest.mostResult(nombre, this.promedio);
    }
}

class repoResultados {

    public void mostResult(String nombre, double promedio) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Guardando reporte");
        System.out.println("Enviando reporte por correo");
        
    }

}
