package ejercicio.pkg1.cajero;
import java.util.Scanner;

/**
 *
 * @author Luis Alberto Sena Martínez
 */
public class Ejercicio1Cajero 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       Cajero obj1=new Cajero();
       int deposito;
       int retiro;
       int opc=0;
       
       do
       {
           System.out.println("""
                            
                              Cajero
                              
                              1. Consultar saldo
                              2. Depositar
                              3. Retirar
                              4. Salir
                   
                              """);
           
           opc=sc.nextInt();
           sc.nextLine();
           
           switch(opc)
           {
               case 1:
                   System.out.println("Saldo disponible: $" + obj1.getSaldo());
                   break;
               
               case 2:
                   System.out.println("Ingrese cantidad a depositar: ");
                   deposito= sc.nextInt();
                   if(deposito<1)
                   {
                       System.out.println("no es posible hacer el deposito");
                   }
                   else
                   {
                       obj1.setSaldo(obj1.getSaldo()+deposito);
                   }
                   System.out.println("Saldo actual: $" + obj1.getSaldo());
                   break;
                   
               case 3:
                   System.out.println("Ingrese cantidad a retirar: ");
                   retiro= sc.nextInt();
                   if(retiro>obj1.getSaldo())
                   {
                       System.out.println("No es posible hacer el retiro, ingrese una cantidad menor o igual al saldo");
                   }
                   else
                   {
                       obj1.setSaldo(obj1.getSaldo()-retiro);
                   }
                   System.out.println("Saldo actual: $" + obj1.getSaldo());
                   break;
                   
               case 4:
                   System.out.println("Saliendo...");
                   break;
                   
               default:
                   System.out.println("Opcion invalida intentelo de nuevo");
           }
           
       }while (opc!=4);
    }
    
    
}

class Cajero
{
    private int saldo;
    
    public Cajero()
    {
        this.saldo=5000;
    }
    
    public int getSaldo()
    {
        return saldo;
    }
    
    public void setSaldo(int x)
    {
        saldo=x;
    }
}