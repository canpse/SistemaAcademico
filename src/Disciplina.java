import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Disciplina {

    private String nome;

    private HashMap<String, Professor> professores;

    private ArrayList<Aula> aulas;

    public Disciplina(String nome, HashMap professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashMap<String, Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(HashMap<String, Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }
}
