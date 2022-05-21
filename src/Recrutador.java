import java.util.ArrayList;

public class Recrutador {
    private int id;
    private String nome;

    Recrutador(){};

    public Recrutador(int id, String nome) {
        this.id = id;
        this.nome = nome;
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

    public void darFeedback(Inscricao inscricao, String descricao){
        inscricao.setFeedback(new FeedBack(descricao));
    }
}
