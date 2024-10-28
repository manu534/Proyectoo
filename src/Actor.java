import java.util.ArrayList;
import java.util.List;

public class Actor extends Persona {
    protected int an_osExperencia;
    public List<Papel> Peliculas = new ArrayList<Papel>();
    public Actor() {}
    public Actor(String nombre, int edad,String pais,int an_osExperencia,List<Papel> lista) {}

    public int getAn_osExperencia() {
        return an_osExperencia;
    }

    public void setAn_osExperencia(int an_osExperencia) {
        this.an_osExperencia = an_osExperencia;
    }

    public List<Papel> getPeliculas() {
        return Peliculas;
    }

    public void setPeliculas(List<Papel> peliculas) {
        this.Peliculas = peliculas;
    }
}
