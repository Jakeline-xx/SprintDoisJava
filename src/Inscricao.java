public class Inscricao {
    private int id;
    private Vaga vaga;
    private Candidato candidato;
    private FeedBack feedback;

    Inscricao(){}

    public Inscricao(Vaga vaga, Candidato candidato) {
        this.vaga = vaga;
        this.candidato = candidato;
    }
    public Inscricao(Vaga vaga, Candidato candidato, FeedBack feedback) {
        this.vaga = vaga;
        this.candidato = candidato;
        this.feedback = feedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public FeedBack getFeedback() {
        return feedback;
    }

    public void setFeedback(FeedBack feedback) {
        this.feedback = feedback;
    }
}
