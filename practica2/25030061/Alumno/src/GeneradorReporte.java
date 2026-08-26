public class GeneradorReporte {
    public void generarReporte(Alumno alumno, double promedio) {

        System.out.println();
        System.out.println("===== REPORTE DEL ALUMNO =====");
        System.out.println("Nombre: " + alumno.nombre);
        System.out.println("Calificacion 1: " + alumno.calificacion1);
        System.out.println("Calificacion 2: " + alumno.calificacion2);
        System.out.println("Calificacion 3: " + alumno.calificacion3);
        System.out.println("Promedio: " + promedio);

        if (promedio >= 6) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}
