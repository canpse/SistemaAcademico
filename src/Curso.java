import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Curso {

    private String nome;
    private ArrayList<Fase> fases;

    public Curso(String nome, ArrayList<Fase> fases) {
        this.nome = nome;
        this.fases = fases;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Fase> getFases() {
        return fases;
    }

    public void setFases(ArrayList<Fase> fases) {
        this.fases = fases;
    }
}
