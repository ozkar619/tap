import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Ej. MALO");
        System.out.println("2. Ej. BUENO");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            ejemploMalo("EMAIL");
            ejemploMalo("SMS");
        } else {
            ejemploBueno(new Email());
            ejemploBueno(new Sms());
            ejemploBueno(new Push());
        }
    }

    // EJ. MALO
    static void ejemploMalo(String tipo) {
        if (tipo.equals("EMAIL")) {
            System.out.println("Enviando un Email");
        } else if (tipo.equals("SMS")) {
            System.out.println("Enviando un SMS");
        }
    }

    //EJ. BUENO
    interface Envio {
        void enviar();
    }
    static class Email implements Envio {
        public void enviar() {
            System.out.println("Enviando un Email");
        }
    }
    static class Sms implements Envio {
        public void enviar() {
            System.out.println("Enviando un SMS");
        }
    }
    static class Push implements Envio {
        public void enviar() {
            System.out.println("Enviando un Push");
        }
    }

    static void ejemploBueno(Envio envio) {
        envio.enviar();
    }
}