class Saxofon extends Instrumento {
    public void tocar()
    {
        System.out.println("Saxofon.tocar()");
    }
    public String tipo()
    {
        return "Soy Saxofon";
    }
    public void afinar() {
        System.out.println("Afino Saxofon");
    }
}