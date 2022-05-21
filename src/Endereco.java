public class Endereco {
    private int id;
    private String logradouro;
    private int numero;
    private String bairro;

    Endereco(){};

    public Endereco(int id, String logradouro, int numero, String bairro) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return logradouro;
    }

    public void setRua(String rua) {
        this.logradouro = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
