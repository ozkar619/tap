package RompeSOLID;

public class Figuras {

class Rectangulo {
    public double base;
    public double altura;
}

class Circulo {
    public double radio;
}

class CalculadoraDeAreas {
    public double calcularArea(Object figura) {
        if (figura instanceof Rectangulo) {
            Rectangulo r = (Rectangulo) figura;
            return r.base * r.altura;
        } else if (figura instanceof Circulo) {
            Circulo c = (Circulo) figura;
            return Math.PI * c.radio * c.radio;
        }
        return 0.0;
    }

    }

}