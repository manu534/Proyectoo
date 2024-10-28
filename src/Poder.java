public class Poder extends Personaje{
    String nombre;
    String descripcion;
    int poder;
    String tipo;

    public Poder(String nombre, String descripcion, int poder,String tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.poder = poder;
        this.tipo = tipo;
    }
    enum tipo {
        Fisico,
        Mental,
        Sobrenatural,
        Tecnologico,
    }

}
