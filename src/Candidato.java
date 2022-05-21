public class Candidato {
    private int id;
    private String nome;
    private int idade;
    private Contato contato;
    private Endereco endereco;

    Candidato(){};

    public Candidato(int id, String nome, int idade, Contato contato, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.contato = contato;
        this.endereco = endereco;
    }

    public Inscricao inscreverNaVaga(Vaga vaga){
        return new Inscricao(vaga, this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("Novo id: " + this.id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
