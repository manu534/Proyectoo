package Logica;

public class AntiHeroe extends Personaje {
    int locura;
    String descripcion;
    String frase;
    public AntiHeroe(String name, String age, int locura,  String descripcion, String frase) {
        super(name, age);
        this.locura = locura;
        this.descripcion = descripcion;
        this.frase = frase;
    }

    public int getLocura() {
        return locura;
    }

    public void setLocura(int locura) {
        this.locura = locura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}