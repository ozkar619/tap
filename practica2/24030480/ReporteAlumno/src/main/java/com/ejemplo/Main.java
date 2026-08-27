package com.ejemplo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la primera calificación: ");
        double calif1 = sc.nextDouble();
        System.out.println("Ingrese la segunda calificación: ");
        double calif2 = sc.nextDouble();

        sc.nextLine();

        System.out.println("Ingrese correo electrónico: ");
        String correo = sc.nextLine();

        Promedio promedio = new Promedio(nombre, calif1, calif2);
        Reporte reporte = new Reporte();
        Archivo archivo = new Archivo();
        servicioCorreo servicioCorreo = new servicioCorreo();

        String rep = reporte.generarReporte(promedio);
        archivo.guardarArchivo(rep, "reporte_" + promedio.getNombre().toLowerCase().replace(" ", "_") + ".txt");
        servicioCorreo.enviarCorreo(correo,rep);
        sc.close();
    }
}