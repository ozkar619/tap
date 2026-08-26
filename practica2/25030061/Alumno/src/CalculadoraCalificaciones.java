public class CalculadoraCalificaciones {
    public double calcularPromedio(Alumno alumno) {

        double promedio;

        promedio = (alumno.calificacion1
                + alumno.calificacion2
                + alumno.calificacion3) / 3;

        return promedio;
    }
}