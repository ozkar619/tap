package com.mycompany.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingresa la primera calificacion: ");
        float cal1 = tec.nextFloat();
        
        System.out.print("Ingresa la segunda calificacion: ");
        float cal2 = tec.nextFloat();
        
        CalProm calculadora = new CalProm();
        Reporte reporte = new Reporte();
        EnviarCorreo correo = new EnviarCorreo();
        
        System.out.println("\n--- Procesando ---");
        
        float promedio = calculadora.calProm(cal1, cal2);
        
        reporte.genRep(promedio);
        reporte.guardarArch();
        correo.enviarCorreo();
        
        tec.close();
    }
}

class CalProm{
        
    float calProm(float cal1, float cal2){
        
        float prom;
        prom = (cal1 + cal2)/2;
        return prom;
    }
}

class EnviarCorreo{
    
    void enviarCorreo(){
        System.out.println("Correo enviado con el promedio del estudiante.");
    }
}

class Reporte{
    void genRep(float prom){
        System.out.println("Se ha generado un reporte del promedio de la calificacion del alumno: " + prom);
    }
    
    void guardarArch(){
        System.out.println("Archivo guardado correctamente");
    }
}