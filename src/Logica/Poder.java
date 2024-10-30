package Logica;

public class Poder extends Personaje {
    String nombre;
    int level;
    String tipo;

    public Poder(String nombre, int level, String tipo) {
        this.nombre = nombre;
        this.level = level;
        this.tipo = tipo;
    }
    enum tipo {
        Fisico,
        Mental,
        Sobrenatural,
        Tecnologico,
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
