class Piano extends Instrumento {
    public void tocar()
    {
        System.out.println("Piano.tocar()");
    }
    public String tipo()
    {
        return "Soy Piano";
    }
    public void afinar() {
        System.out.println("Afino piano ");
    }
}