import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe tu contraseña: ");
        String password = sc.nextLine();

        String resultado = validar(password);

        if (resultado.equals("OK")) {
            System.out.println("Contraseña Válida!!!");
        } else {
            System.out.println("Contraseña NO VÁLIDA: " + resultado);
        }
    }

    public static String validar(String password) {
        if (password.length() < 8) {
            return "debe tener al menos 8 caracteres";
        }

        boolean mayus = false, minus = false, num = false, simb = false;
        String simbolos = "!@#$%^&*()_-+=<>?/";

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) mayus = true;
            if (Character.isLowerCase(c)) minus = true;
            if (Character.isDigit(c)) num = true;
            if (simbolos.contains(String.valueOf(c))) simb = true;
        }

        if (!mayus) return "le falta una mayúscula";
        if (!minus) return "le falta una minúscula";
        if (!num) return "le falta un número";
        if (!simb) return "le falta un símbolo (!@#$% etc)";

        return "OK";
    }
}