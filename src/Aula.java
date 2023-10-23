import java.util.Date;
import java.util.HashMap;

public class Aula {

    private HashMap<Professor, RegistroChamada> chamada;
    private String data;

    public Aula(String data) {
        this.data = data;
        this.chamada = new HashMap<>();
    }

    public HashMap<Professor, RegistroChamada> getChamada() {
        return chamada;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
