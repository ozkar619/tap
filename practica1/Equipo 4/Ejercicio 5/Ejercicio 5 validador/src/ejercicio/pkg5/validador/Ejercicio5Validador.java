package ejercicio.pkg5.validador;
import java.util.Scanner;

/**
 *
 * @author Luis Alberto Sena Martínez
 */
public class Ejercicio5Validador 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese contraseña: ");
        String password=sc.nextLine();
        
        if(password.length()<8)
        {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }
        
        boolean tieneDigito=false;
        boolean tieneMayuscula=false;
        boolean tieneMinuscula=false;
        boolean tieneSimbolo=false;
        boolean tieneEspacio=false;
        
        for(char c : password.toCharArray())
        {
            if(Character.isDigit(c))
            {
                tieneDigito=true;
            }
            
            if(Character.isUpperCase(c))
            {
                tieneMayuscula=true;
            }
            
            if(Character.isLowerCase(c))
            {
                tieneMinuscula=true;
            }
            
            if(Character.isSpaceChar(c))
            {
                tieneEspacio=true;
            }
            
            if(!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c))
            {
                tieneSimbolo=true;
            }
        }
        
        if(tieneDigito && tieneMayuscula && tieneMinuscula && tieneSimbolo && !tieneEspacio)
        {
            System.out.println("Contraseña valida");
        }
        else
        {
            System.out.println("Contraseña invalida");
            
            if(!tieneDigito)
            {
                System.out.println("La contraseña no tiene un numero");
            }
            
            if(!tieneMayuscula)
            {
                System.out.println("La contraseña no tiene una mayuscula");
            }
            
            if(!tieneMinuscula)
            {
                System.out.println("La contraseña no tiene una minuscula");
            }
            
            if(!tieneSimbolo)
            {
                System.out.println("La contraseña no tiene un simbolo especial");
            }
            
            if(tieneEspacio)
            {
                System.out.println("La contraseña contiene espacios");
            }
        }
    }
}
