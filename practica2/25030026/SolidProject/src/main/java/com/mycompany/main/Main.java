package com.mycompany.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
             
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
        System.out.println("Archivo guardado correctamente en la base de datos");
    }
}