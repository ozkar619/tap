package adivinanumero;
import java.util.Scanner;
public class AdivinaNumero {
    public static void main(String[] args) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        n = (int) (Math.random()*100);
        for (int i = 1; i < 7; i++) {
            System.out.println("Ingresa el número del 1 al 100 que estoy pensando");
            x = sc.nextInt();
            if (x<n) {
                System.out.println("El número es menor");
            }
            else 
            {
                if (x>n) {
                System.out.println("El número es mayor");
            }
                else if (x==n) {
                System.out.println("!Correcto¡");
                System.out.println("Intentos:" +i);
                break;
            }
        }
        }
        System.out.println("Juego Terminado");
        System.out.println("El numero era: "+n);
    }
}
