import java.util.Scanner;

public class Musica
{
    public static void main(String[] args) {
        Scanner dg=new Scanner(System.in);
        int op;
        System.out.println("Teclea el número de instrumentos");
        int n=dg.nextInt();
        Instrumento[] orquesta = new Instrumento[n];


        for(int i=0;i<n;i++)
        {
            System.out.println("Teclea tipo de instrumento número "+(i+1));
            System.out.println("1) Guitarra");
            System.out.println("2) Piano");
            System.out.println("3) Saxofon");
            op=dg.nextInt();
            switch(op)
            {
                case 1: orquesta[i] = new Guitarra();
                    break;
                case 2: orquesta[i] = new Piano();
                    break;
                case 3: orquesta[i] = new Saxofon();
                    break;
            }
        }
        System.out.println("Afinar instrumentios");
        afinarTodo(orquesta);
        System.out.println("\n\n\nTocar Instrumentos");
        tocarTodos(orquesta);
        //orquesta[3].afinar();
    }
    static void afinar(Instrumento i) { // ...
        i.afinar();
    }
    static void afinarTodo(Instrumento[] e) {
        for(int i = 0; i < e.length; i++)
        {
            System.out.println("Es un instrumento de tipo: "+e[i].tipo());
            afinar(e[i]);
        }
    }
    static void tocarTodos(Instrumento[] e) {
        for(int i = 0; i < e.length; i++)
        {
            System.out.println("Es un instrumento de tipo: "+e[i].tipo());
            e[i].tocar();
        }
    }
}
