package Logica;

public class Heroe extends Personaje {
    int poder;
    String descripcion;
    String frase;

    public Heroe(String name, String age, int poder, String descripcion, String frase) {
        super(name, age);
        this.poder = poder;
        this.descripcion = descripcion;
        this.frase = frase;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
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
