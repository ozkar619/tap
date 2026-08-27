package com.ejemplo;
import java.util.Scanner;


public class Reporte {

    public String generarReporte(Promedio promedio){
        System.out.println("Generando reporte para " + promedio.getNombre() + "...");
        return "Reporte de calificaciones\nAlumno:" + promedio.getNombre() + "\nPromedio: " + promedio.calcularProm();
    }
}
