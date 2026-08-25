import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(100) + 1;
        int intentos = 0;
        int maxIntentos = 0;
        int nivel;
        int respuesta = 0;

        System.out.println("1. Facil");
        System.out.println("2. Medio");
        System.out.println("3. Dificil");
        System.out.print("Selecciona un nivel: ");
        nivel = sc.nextInt();

        if (nivel == 1) {
            maxIntentos = 10;
        } else if (nivel == 2) {
            maxIntentos = 7;
        } else {
            maxIntentos = 5;
        }

        while (intentos < maxIntentos) {

            System.out.print("Ingresa un numero entre 1 y 100: ");
            respuesta = sc.nextInt();

            intentos++;

            if (respuesta == numero) {
                System.out.println("¡Correcto!");
                System.out.println("Intentos utilizados: " + intentos);
                break;
            } else if (respuesta < numero) {
                System.out.println("El numero es MAYOR");
            } else {
                System.out.println("El numero es MENOR");
            }
        }

        if (intentos == maxIntentos && respuesta != numero) {
            System.out.println("El numero era: " + numero);
        }
    }
}