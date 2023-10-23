import java.util.ArrayList;

public class Aluno {

    private ArrayList<Disciplina> matricula;
    private String nome;

    private Curso curso;

    public Aluno(String nome, Curso curso) {
        this.nome = nome;
        this.matricula = new ArrayList<Disciplina>();
        this.curso = curso;
    }

    public ArrayList<Disciplina> getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
