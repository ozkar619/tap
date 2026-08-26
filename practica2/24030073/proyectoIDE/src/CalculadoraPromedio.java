public class CalculadoraPromedio {

    public double calcular(Alumno alumno) {
        return (alumno.getCalificacion1() + alumno.getCalificacion2()) / 2.0;
    }
}