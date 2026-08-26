import java.util.Scanner;

//public static void main(String[] args)
void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    Alumno alumno1 = new Alumno("Ramon",25010614);
    Kardex kardex1 = new Kardex(80,75,96);

    boolean continuar = true;
    while (continuar){
    System.out.println("Presione: \n1. Consultar Reporte  \n2. Guardar  \n3. Enviar \n4. Salir");
    int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                Reporte.formato(kardex1,alumno1); break;
            case 2:
                Guardar.save(); break;
            case 3:
                Enviar.enviar(); break;
            case 4:
                System.out.println("Saliendo...");
                continuar=false; break;
        }
    }
}

class Alumno{
    private final String nombre;
    private final int noControl;
    public Alumno(String nombre,int noControl){
        this.nombre = nombre;
        this.noControl = noControl;
    }
    public String getNombre(){
        return nombre;
    }
    public int getNoControl(){
        return noControl;
    }
}

class Kardex{
    private final int calf1;
    private final int calf2;
    private final int calf3;

    public Kardex(int calf1, int calf2, int calf3){
        this.calf1 = calf1;
        this.calf2 = calf2;
        this.calf3 = calf3;
    }
    public int getCalf1() {
        return calf1;
    }

    public int getCalf2() {
        return calf2;
    }

    public int getCalf3() {
        return calf3;
    }

    public int promedio(){
        int promedio1 = (calf1 + calf2 +calf3) /3;
        return promedio1;
    }
}

class Reporte{
    public static void formato(Kardex kardex1,Alumno alumno1){
        System.out.println("======Reporte======");
        System.out.println("Nombre del alumno: "+ alumno1.getNombre());
        System.out.println("Numero de control: "+ alumno1.getNoControl());
        System.out.println("Calificaciones: \nParcial 1: "+ kardex1.getCalf1()+"\nParcial 2: "
                + kardex1.getCalf2()+"\nParcial 3: " + kardex1.getCalf3());
        System.out.println("Promedio: "+ kardex1.promedio());
    }
}
class Enviar{
    public static void enviar(){
        System.out.println("El reporte fue enviado!");
    }
}
class Guardar{
    public static void save(){
        System.out.println("El reporte se guardo con exito!");
    }
}






