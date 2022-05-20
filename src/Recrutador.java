import java.util.ArrayList;

public class Recrutador {
    private int id;
    private String nome;
    private ArrayList<Vaga> vagas = new ArrayList<>();

    Recrutador(){};

    public Recrutador(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void darFeedback(int id){
        for (Vaga vaga : vagas) {
            if (vaga.getCandidatos().get()){

            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(ArrayList<Vaga> vagas) {
        this.vagas = vagas;
    }
}
