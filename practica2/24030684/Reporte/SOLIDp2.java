import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomAlum,correo;
        System.out.println("Nombre del condenado alumno :");
        nomAlum=sc.nextLine();

        List<Double> calif = new ArrayList<>();
        System.out.println("ingresa las 4 calificaciones :");
        for (int i=0; i<4; i++){
            System.out.println("Calificacion " +(i+1)+ ":");
            calif.add(sc.nextDouble());
        }
        sc.nextLine();
        System.out.println("Ingresa el correo:");
        correo=sc.nextLine();

        Prom prom = new Prom(nomAlum,calif);

        Reporte repo = new Reporte();
        guarArchi archi = new guarArchi();
        envCorreo corre = new envCorreo();

        repo.genReporte(prom);
        System.out.println(archi.toString());
        System.out.println(corre.toString());
    }
}
class Prom{
    private String nomAlum;
    private List<Double> calif;
    public Prom(String nomAlum, List<Double> calif) {
        this.calif=calif;
        this.nomAlum=nomAlum;

    }

    public String getNomAlum() {
        return nomAlum;
    }

    public List<Double> getCalif() {
        return calif;
    }

    public double Promedio(){
        double suma=0.0;
        for (double c : calif){
            suma +=c;
        }
        return suma/calif.size();
    }
}
class Reporte{
    public void genReporte(Prom p) {
        double prom = p.Promedio();

        System.out.println("\n REPORTE GENERADO ");
        System.out.println("Alumno: " + p.getNomAlum());
        System.out.println("Calificaciones: " + p.getCalif());
        System.out.println("Promedio: " + prom);
        System.out.println("--------------------\n");
    }
}
class guarArchi{
    @Override
    public String toString() {
        String sms="Se guardo el archivo correctamente";
        return sms;
    }
}
class envCorreo{
    @Override
    public String toString() {
        String sms="Se envio al correo";
        return sms;
    }
}