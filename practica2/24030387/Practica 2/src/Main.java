import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Alumno obj1=new Alumno(sc);

        calcularPromedio calculadora = new calcularPromedio();
        double promedio = calculadora.calcProm(obj1.getCalificaciones());
        obj1.setProm(promedio);

        ReporteAlumno reporte = new ReporteAlumno();
        reporte.generarReporte(obj1);


        guardarArchivos archivo = new guardarArchivos();


        enviarCorreo correo = new enviarCorreo();

        sc.close();
    }
}

class Alumno {
    private String nombre;
    private String noCtrl;
    private int[] calificaciones;
    private double prom;

    public Alumno(Scanner sc)
    {
        capDatos(sc);
    }

    public void capDatos(Scanner sc)
    {
        System.out.println("Ingrese nombre del alumno: ");
        this. nombre=sc.nextLine();

        System.out.println("Ingrese Numero de control del alumno: ");
        this.noCtrl=sc.nextLine();

        this.calificaciones=new int[4];
        for (int i=0; i<4; i++)
        {
            System.out.println("Ingrese la calificacion " + i+1 + ":");
            calificaciones[i]=sc.nextInt();
        }
        this.prom=0;
    }

    public double getProm()
    {
        return prom;
    }

    public void setProm(double prom)
    {
        this.prom = prom;
    }

    public int[] getCalificaciones()
    {
        return calificaciones;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getNoCtrl()
    {
        return noCtrl;
    }
}

class calcularPromedio
{
    public double calcProm(int[] calfs)
    {
        int totalcalf=0;
        double prome;
        for (int i=0; i<4; i++)
        {
            totalcalf+=calfs[i];
        }
        prome= (double) totalcalf /calfs.length;
        return prome;
    }
}

class ReporteAlumno
{

    public void generarReporte(Alumno al)
    {
        System.out.println("---------------");
        System.out.println("Nombre: " + al.getNombre());
        System.out.println("Numero de control: " + al.getNoCtrl());
        int[] calfs = al.getCalificaciones();
        for (int i = 0; i < calfs.length; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + calfs[i]);
        }
        System.out.println("Pomedio: " + al.getProm());
        System.out.println("---------------");
    }
}

class guardarArchivos
{
    public guardarArchivos()
    {
        System.out.println("Archivo guardaro");
    }
}

class enviarCorreo
{
    public enviarCorreo()
    {
        System.out.println("Enviando correo...");
        for (int i=0; i<5; i++)
        {
            System.out.println(".");
        }
        System.out.println("Correo enviado");
    }
}