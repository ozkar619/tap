public class Alumno {

    private String nombre;
    private String correo;
    private double calificacion1;
    private double calificacion2;

    public Alumno(String nombre, String correo, double calificacion1, double calificacion2) {
        this.nombre = nombre;
        this.correo = correo;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public double getCalificacion1() {
        return calificacion1;
    }

    public double getCalificacion2() {
        return calificacion2;
    }
}