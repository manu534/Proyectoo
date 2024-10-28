public class AntiHeroe extends Personaje{
    int locura;
    String descripcion;
    String frase;
    public AntiHeroe(String name, String age, int locura,  String descripcion, String frase) {
        super(name, age);
        this.locura = locura;
        this.descripcion = descripcion;
        this.frase = frase;
    }

}