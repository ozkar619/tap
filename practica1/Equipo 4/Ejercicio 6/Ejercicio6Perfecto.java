import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio6Perfecto{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);    
        int num = 0;    
        
        //eleccion
        System.out.println("1- Normal \n2-Reto (1 al 10,000)");
        int opcion = scanner.nextInt();

        if (opcion==2){
            for (int j=1; j<10000; j++){ //numeros perfectos del 1 al 10,000
                num = j;
                ArrayList<Integer> listaDivisores = obtenerDivisores(num);
                muestraResultado(opcion,listaDivisores, num);
            }
        }else{
            num = scanner.nextInt(); 
            ArrayList<Integer> listaDivisores = obtenerDivisores(num);  
            muestraResultado(opcion,listaDivisores, num);
        }
        scanner.close();
    }

    //Lista de divisores enteros
    public static ArrayList<Integer> obtenerDivisores(int numero){
        ArrayList<Integer> divisores = new ArrayList<>();

        for (int i=1; i<=numero/2 ;i++){
            if (numero %i ==0){
                divisores.add(i);
            }
        }
        return divisores;
    }

    //Metodo para mostrar resultados
    public static void muestraResultado(int opcion,ArrayList<Integer> listaDivisores,int num){
        int suma=0;
        //sumar para decision de impresion
        for (int div:listaDivisores){
            suma += div;
        }
        //Salida formato        
        if (opcion==1 || (opcion==2 && suma==num)){
            System.out.print("Divisores: ");
            for (int i=0; i<listaDivisores.size() ;i++){
                //int div = listaDivisores.get(i);
                System.out.print(listaDivisores.get(i));
                if (i <listaDivisores.size() -1){
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " +suma);

            //Comprobacion
            if (suma == num){
                System.out.println(num +" Es un numero perfecto.");
            }else{
                System.out.println(num +" NO es un numero perfecto.");
            }
        }
        
    }
}