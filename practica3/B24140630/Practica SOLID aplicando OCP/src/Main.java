import java.util.Scanner;

interface Vehiculo {
    double calcular(int distancia);
}

class taxi implements Vehiculo {
    public double calcular(int distancia) {
        return distancia * 30;
    }
}

class avion implements Vehiculo {
    public double calcular(int distancia) {
        return distancia * 90;
    }
}

class carro implements Vehiculo {
    public double calcular(int distancia) {
        return distancia * 10;
    }
}

class moto implements Vehiculo {
    public double calcular(int distancia) {
        return distancia * 10;
    }
}

class Vehiculos {
    double calculador(Vehiculo vehiculo, int distancia) {
        return vehiculo.calcular(distancia);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehiculos vehiculos = new Vehiculos();

        System.out.println("En que tipo de vehiculo desea transportarse: ");
        String tipo = sc.next();

        System.out.println("Cuantos kilometros va a recorrer: ");
        int distancia = sc.nextInt();

        Vehiculo vehiculo;

        if (tipo.equals("taxi")) {
            vehiculo = new taxi();
        } else if (tipo.equals("avion")) {
            vehiculo = new avion();
        } else if (tipo.equals("carro")) {
            vehiculo = new carro();
        } else if (tipo.equals("moto")) {
            vehiculo = new moto();
        } else {
            System.out.println("El vehiculo no esta disponible, intentalo de nuevo");
            return;
        }

        System.out.printf("El precio de su recorrido utilizando " + tipo + "\nSeria de un total de: " + vehiculos.calculador(vehiculo, distancia) + " Pesos Mexicanos");

    }
}
