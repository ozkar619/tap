import java.util.Scanner;

class Vehiculos{
    double calculador(String vehiculo, int distancia){
        if(vehiculo.equals("taxi")){
            return distancia * 30;
        } else if(vehiculo.equals("avion")){
            return distancia * 90;
        } else if(vehiculo.equals("carro")){
            return distancia * 10;
        } else if(vehiculo.equals("moto")){
            return distancia * 10;
        }
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehiculos vehiculos = new Vehiculos();

        System.out.println("En que tipo de vehiculo desea transportarse: ");
        String vehiculo = sc.next();
        System.out.println("Cuantos kilometros va ha recorrer: ");
        int distancia = sc.nextInt();

        System.out.printf("El precio de su recorrido utilizando " + vehiculo + "\nSeria de un total de: " + vehiculos.calculador(vehiculo, distancia) + " Pesos Mexicanos");
    }
}