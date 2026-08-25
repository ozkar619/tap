package ejertap;

import java.util.Scanner;
public class Analizador_Calificaciones {
	    public static void main(String[] args) {
	        Scanner src = new Scanner(System.in);
	        
	        System.out.print("Alumnos: ");
	        int Num_Alumnos = src.nextInt();
	        
	        double[] calificaciones = new double[Num_Alumnos];
	        
	        double suma = 0;
	        int aprobados = 0;
	        int reprobados = 0;
	        
	        System.out.println("Calificaciones:");
	        for (int i = 0; i < Num_Alumnos; i++) {
	            calificaciones[i] = src.nextDouble();
	            
	            suma += calificaciones[i];
	            
	            if (calificaciones[i] >= 6) {
	                aprobados++;
	            } else {
	                reprobados++;
	            }
	        }
	        
	        double max = calificaciones[0];
	        double min = calificaciones[0];
	        
	        for (int i = 1; i < Num_Alumnos; i++) {
	            if (calificaciones[i] > max) {
	                max = calificaciones[i];
	            }
	            if (calificaciones[i] < min) {
	                min = calificaciones[i];
	            }
	        }
	        
	        double promedio = suma / Num_Alumnos;
	        double porcentajeAprobacion = ((double) aprobados / Num_Alumnos) * 100;
	        
	        System.out.println("Promedio: " + promedio);
	        System.out.println("Mayor: " + max);
	        System.out.println("Menor: " + min);
	        System.out.println("Aprobados: " + aprobados);
	        System.out.println("Reprobados: " + reprobados);
	        System.out.println("Porcentaje aprobación: " + porcentajeAprobacion + "%");
	        
	       
	        for (int i = 0; i < Num_Alumnos; i++) {
	            String estado = (calificaciones[i] >= 6) ? "APROBADO" : "REPROBADO";
	            System.out.println("Alumno " + (i + 1) + " -> " + calificaciones[i] + " -> " + estado);
	        }
	        
	    }
	}

   
	
	
	
	
	

