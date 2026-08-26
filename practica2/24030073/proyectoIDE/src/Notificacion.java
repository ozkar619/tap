public class Notificacion {

    public void enviarPorCorreo(Alumno alumno, String reporte) {
        System.out.println("Enviando correo electrónico a: " + alumno.getCorreo());
        System.out.println("Mensaje enviado exitosamente.");
    }
}