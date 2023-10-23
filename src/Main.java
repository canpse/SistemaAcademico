import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Professor> professores = new HashMap();
        professores.put("Alan", new Professor("Alan"));
        professores.put("João", new Professor("João"));

        HashMap<String, Disciplina> disciplinas = new HashMap<>();
        disciplinas.put("Banco de Dados", new Disciplina("Banco de Dados", professores));
        disciplinas.get("Banco de Dados").getAulas().add(new Aula("10-22-2023"));

        ArrayList<Fase> fases = new ArrayList<>();
        fases.add(new Fase(disciplinas));

        Curso curso = new Curso("BCC", fases);

        HashMap<String, Aluno> alunos = new HashMap<>();
        alunos.put("Carlos", new Aluno("Carlos", curso));
        alunos.put("Felipe", new Aluno("Felipe", curso));
        alunos.put("Lucas", new Aluno("Lucas", curso));

        alunos.get("Carlos").getMatricula().add(disciplinas.get("Banco de Dados"));
        alunos.get("Felipe").getMatricula().add(disciplinas.get("Banco de Dados"));
        alunos.get("Lucas").getMatricula().add(disciplinas.get("Banco de Dados"));

        RegistroChamada rc = new RegistroChamada(alunos.get("Carlos"), true);
        disciplinas.get("Banco de Dados").getAulas().get(0).getChamada().put(professores.get("Alan"), rc);

    }

}