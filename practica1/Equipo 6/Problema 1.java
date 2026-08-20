import java.util.Scanner;

public class main{
public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int saldo = 5000;
    while(1==1){
    System.out.print("Selecciona la accion a realizar\n" +
    "[1]Consultar saldo\n"+
    "[5]Depositar\n"+
    "[3]Retirar\n"+ 
    "[4]Salir");
    System.out.println("");

    int n = scan.nextInt();
    switch(n){

        case 1:

        System.out.println("Tu saldo actual es de $" + saldo);

        break;
        
        case 5:

        System.out.println("¿Cuanto dinero quieres depositar?");
        int deposito = scan.nextInt();
        if(deposito>0){
            saldo += deposito;
        }  else {
            System.out.println("La cantidad depositada debe ser positiva");
        };

        System.out.println("Tu saldo actual es de $" + saldo);

        break;
        
        case 3:

        System.out.println("¿Cuanto dinero quieres retirar?");
        int retiro = scan.nextInt();
        if(saldo>=retiro){
            saldo -= retiro;
        }  else {
            System.out.println("La cantidad retirada excede los fondos");
        };  

        System.out.println("Tu saldo actual es de $" + saldo);

        break;
        
        case 4:

        System.out.println("Tu saldo fue de $" + saldo);    
        System.out.println("Gracias por usarlo");
        
        return;

        
    };
}
}
}