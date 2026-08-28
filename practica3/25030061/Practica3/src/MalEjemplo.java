public class MalEjemplo {
    public double calcular(String tipo, double precio) {
        if (tipo.equals("estudiante")) {
            return precio * 0.90;
        }
        if (tipo.equals("maestro")) {
            return precio * 0.80;
        }
        return precio;
    }

}
