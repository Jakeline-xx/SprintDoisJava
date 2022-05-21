public class Main {
    public static void main(String[] args) {
        Vaga vagaJr = new Vaga(1, "Dev Jr", "Ser um Desenvolvedor Júnior na IBM");
        Vaga vagaPl = new Vaga(2, "Dev Pleno", "Ser um Desenvolvedor Pleno na IBM");
        Vaga vagaSr = new Vaga(3, "Dev Sênior", "Ser um Desenvolvedor Sênior na IBM");

        Candidato candidatoUm = new Candidato(1, "Jakeline", 21,
                                                new Contato("jakeline@jake", 1196666),
                                                new Endereco("Rua Oito", 23, "Guaianases"));

        Candidato candidatoDois = new Candidato(2, "Lucas", 24,
                                                new Contato("lucas@lucas", 1190000),
                                                new Endereco("Rua Nove", 222, "Robru"));

        Candidato candidatoTres = new Candidato(3, "Gabriel", 22,
                                                new Contato("gabriel@gab", 1198888),
                                                new Endereco("Rua Dez", 33, "Itaquera"));



        Recrutador recrutador = new Recrutador(1, "Fatima");


        Inscricao inscricao = candidatoUm.inscreverNaVaga(vagaSr);
        recrutador.darFeedback(inscricao, "Sinto muito, você foi reprovado!");


        Inscricao inscricao2 = candidatoDois.inscreverNaVaga(vagaPl);
        recrutador.darFeedback(inscricao2, "Parabens, você foi aprovado!");

        System.out.println(inscricao.getCandidato().getEndereco().getBairro());
    }
}