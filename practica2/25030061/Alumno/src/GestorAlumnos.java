public class GestorAlumnos {
    public Alumno agregarAlumno(String nombre,
                                double calificacion1,
                                double calificacion2,
                                double calificacion3) {

        Alumno alumno = new Alumno(
                nombre,
                calificacion1,
                calificacion2,
                calificacion3
        );

        return alumno;
    }

}
