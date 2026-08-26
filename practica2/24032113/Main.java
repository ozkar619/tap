import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre del alumno: ");
        String nombre = sc.nextLine();
        
        System.out.print("Calificación 1: ");
        double c1 = sc.nextDouble();
        
        System.out.print("Calificación 2: ");
        double c2 = sc.nextDouble();
        
        System.out.print("Calificación 3: ");
        double c3 = sc.nextDouble();
        sc.nextLine();
        
        Alumno alumno = new Alumno(nombre, c1, c2, c3);
        CalculadoraPromedio calc = new CalculadoraPromedio();
        GeneradorReporte reporte = new GeneradorReporte();
        GestorArchivo archivo = new GestorArchivo();
        GestorCorreo correo = new GestorCorreo();
        
        double promedio = calc.calcular(alumno);
        reporte.mostrar(alumno, promedio);
        archivo.guardar("Reporte de " + nombre);
        
        System.out.print("Ingresa el correo electrónico: ");
        String email = sc.nextLine();
        
        correo.enviar("Reporte de " + nombre, email);
        sc.close();
    }
}

class Alumno {
    private String nombre;
    private double calif1;
    private double calif2;
    private double calif3;
    
    public Alumno(String nombre, double calif1, double calif2, double calif3) {
        this.nombre = nombre;
        this.calif1 = calif1;
        this.calif2 = calif2;
        this.calif3 = calif3;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getCalif1() {
        return calif1;
    }
    
    public double getCalif2() {
        return calif2;
    }
    
    public double getCalif3() {
        return calif3;
    }
}

class CalculadoraPromedio {
    public double calcular(Alumno alumno) {
        double suma = alumno.getCalif1() + alumno.getCalif2() + alumno.getCalif3();
        return suma / 3;
    }
}

class GeneradorReporte {
    public void mostrar(Alumno alumno, double promedio) {
        System.out.println("Alumno: " + alumno.getNombre());
        System.out.println("Promedio: " + promedio);
    }
}

class GestorArchivo {
    public void guardar(String mensaje) {
        System.out.println("Archivo guardado: " + mensaje);
    }
}

class GestorCorreo {
    public void enviar(String mensaje, String email) {
        System.out.println("Correo enviado a: " + email);
    }
}
