import java.util.ArrayList;

public class Vaga {
    private int id;
    private String titulo;
    private String descricao;

    Vaga(){};

    public Vaga(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String listarVaga(){
        return ("Id: " + this.getId() + " Vaga: " + this.getTitulo() + " Descricao: " + this.getDescricao());
    }
}
