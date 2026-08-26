public class GeneradorReporte {

    public String generar(Alumno alumno, double promedio) {

        return "========== REPORTE ==========\n" +
                "Alumno: " + alumno.getNombre() + "\n" +
                "Correo: " + alumno.getCorreo() + "\n" +
                "Calificación 1: " + alumno.getCalificacion1() + "\n" +
                "Calificación 2: " + alumno.getCalificacion2() + "\n" +
                "Promedio Final: " + promedio + "\n" +
                "=============================";
    }
}