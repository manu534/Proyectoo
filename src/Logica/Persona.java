package Logica;

public class Persona {
    protected String nombre;
    protected int edad;
    protected String pais;

    public Persona() {}
    public Persona(String nombre, int edad, String pais) {}

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}