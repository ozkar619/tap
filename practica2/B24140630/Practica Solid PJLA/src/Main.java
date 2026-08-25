import  java.util.Scanner;

class Calc{

        float operacion(float primer, float segundo){

                float suma = primer + segundo;
                float resultado = suma/2;

                return resultado;
        };

}

class Gen{

        void Reporte(float promedio){
                System.out.println("Se ha generado un reporte con el promedio del estudiante: " + promedio);
        }
        void Guardado(){
                System.out.println("Se ha guardado exitosamente el archivo en la base de datos");
        }

}

class Envio{
        void email(){
                System.out.println("Se ha enviado el correo con el promedio al estudiante: estudiante@itcelaya.tecnm.mx");
        }
}

public class Main {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                Calc calc1 = new Calc();
                Gen gen1 = new Gen();
                Envio envio1 = new Envio();

                float primero=0,segundo=0,promedio=0;

                System.out.print("Cual es la primer calificacion del estudiante: ");
                primero = sc.nextFloat();
                System.out.println("Cual es la segunda calificacion del estudiante: ");
                segundo = sc.nextFloat();

                promedio = calc1.operacion( primero, segundo);
                System.out.println(promedio);

                gen1.Reporte(promedio);
                gen1.Guardado();

                envio1.email();

        }
}

