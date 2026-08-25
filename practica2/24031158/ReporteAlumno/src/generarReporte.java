import java.util.Scanner;
public class generarReporte {
    String nroCtrl,nom, s;
    byte sem;
    double prom;
    String generaRep()
    {
        Scanner dg=new Scanner(System.in);
        System.out.println("Teclea numero control");
        nroCtrl=dg.nextLine();
        System.out.println("Teclea nombre");
        nom=dg.nextLine();
        System.out.println("Teclea semestre");
        sem=dg.nextByte();
        System.out.println("Teclea Promedio");
        prom=dg.nextDouble();

        s=("\nNúmero de Control: "+nroCtrl+"\nNombre: "+nom+"\nSemestre: "+sem);
        return s;
    }
}
