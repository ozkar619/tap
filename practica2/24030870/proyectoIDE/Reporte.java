package com.mycompany.main0;

import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Calificaciones: ");
        int n = sc.nextInt();
        double[] calificaciones = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Calificacion " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
        }
        Alumno alumno = new Alumno(nombre, calificaciones);
        CalculadoraPromedio calc = new CalculadoraPromedio();
        double promedio = calc.calcular(alumno.getCalificaciones());
        GeneradorReporte generador = new GeneradorReporte();
        String reporte = generador.generar(alumno, promedio);
        System.out.println("\n" + reporte);
        generador.guardar(reporte, "reporte.txt");

        sc.close();
    }
}
class Alumno {
    private String nombre;
    private double[] calificaciones;
    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
    public String getNombre() {
        return nombre;
    }
    public double[] getCalificaciones() {
        return calificaciones;
    }
}
class CalculadoraPromedio {
    public double calcular(double[] calificaciones) {
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return suma / calificaciones.length;
    }
}
class GeneradorReporte {
    public String generar(Alumno alumno, double promedio) {
        String reporte = " Reporte \n"
                + "Nombre: " + alumno.getNombre() + "\n"
                + "Promedio: " + promedio + "\n"
                + "---";
        return reporte;
    }
    public void guardar(String contenido, String nombreArchivo) {
        System.out.println("Archivo guardado: " + nombreArchivo);
    }
}
   