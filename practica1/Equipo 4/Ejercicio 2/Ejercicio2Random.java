import java.util.Random;
import java.util.Scanner;
  
public class Ejercicio2Random{
    public static void main(String[] args){

        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        int cont = 0 , intentos = 0;
        int noRandom = rnd.nextInt(100)+1;
        System.out.println("Elige un nivel de dificultad: \n 1 - Facil \n 2 - Medio \n 3 - Dificil"); 
        int level = scanner.nextInt();

        switch(level) {
            case 1: intentos = 10; break;
            case 2: intentos = 7; break;
            case 3: intentos = 5; break;
            default: intentos = 7;
        }

        System.out.println("Adivina el numero! (entre 1 y 100)");

        boolean win = false;

        while (intentos > 0) {
            cont = cont + 1;
            intentos = intentos - 1;
            int noUsuario = scanner.nextInt(); 
            
            if (noRandom == noUsuario) {
                System.out.println("¡Correcto! \nIntentos utilizados: " + cont);
                win = true; break; 
            }else if (noRandom > noUsuario) {
                System.out.println("El numero es MAYOR");
            }else {
                System.out.println("El numero es MENOR");
            }
            System.out.println("Intentos restantes: " + cont);
        }
        if (!win){
            System.out.println("Juego terminado!");            
        }
        System.out.println("El numero era: "+ noRandom);
        scanner.close();
    }
}