import java.util.Scanner;

public class calcularPromedio {
    int m1, m2, m3, prom;
    String obtenerProm()
    {
        Scanner dg=new Scanner(System.in);
        System.out.println("Ingresa la calif de la materia 1");
        m1 = dg.nextInt();
        System.out.println("Ingresa la calif de la materia 2");
        m2 = dg.nextInt();
        System.out.println("Ingresa la calif de la materia 3");
        m3 = dg.nextInt();
        prom = (m1+m2+m3)/3;

        String s = ("\nCalificación de la materia 1: "+m1+"\nCalificación de la materia 2: "+m2+"\nCalificación de la materia 3:"+m3+"\nPromedio:"+prom);
        return s;
    }
}
