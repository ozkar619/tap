//Buen Ejemplo

public interface RecetaTaco {
    void preparar();
}

public class TacoPastor implements RecetaTaco {
    public void preparar() {
        System.out.println("Cortando carne del trompo y agregando piña.");
    }
}

public class Taquero {
    public void prepararTaco(RecetaTaco taco) {
        taco.preparar();
    }
}