public class ReporteAlumno {
    private String nombre;
    private double calificacion1;
    private double calificacion2;


    public ReporteAlumno(String nombre, double calificacion1, double calificacion2) {
        this.nombre = nombre;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
    }


    public String getNombre() { return nombre; }
    public double getCalificacion1() { return calificacion1; }
    public double getCalificacion2() { return calificacion2; }


    public String generarReporte(double promedio) {
        return "REPORTE DE ALUMNO \n" +
                "Nombre: " + nombre + "\n" +
                "Calificaciones: " + calificacion1 + ", " + calificacion2 + "\n" +
                "Promedio Final: " + promedio + "\n" +
                "";
    }
}