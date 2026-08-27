class Guitarra extends Instrumento {
    public void tocar()
    {
        System.out.println("Tocando Guitarra");
    }
    public String tipo()
    {
        return "Soy Guitarra";
    }
    public void afinar() {
        System.out.println("Afinoi Guitarra ");
    }
}