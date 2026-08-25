//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String cve, rep, prom;
        generarReporte re = new generarReporte();
        calcularPromedio pr = new calcularPromedio();
        guardaArchivo arch = new guardaArchivo();
        enviaCorreo cr = new enviaCorreo();
        Scanner dg = new Scanner(System.in);
        System.out.println("Ingresa el numero del reporte");
        cve = dg.next();
        rep = re.generaRep();
        prom = pr.obtenerProm();
        arch.guardaArchivo(cve,prom,rep);
        cr.mandarCorreo();
    }
}