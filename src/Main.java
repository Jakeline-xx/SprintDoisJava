
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


//ESTE PROJETO FOI REALIZADO PELO INTELIJ, POR ISSO TALVEZ DÊ ALGUMA DIVERGENCIA NO ECLIPSE, POR EXEMPLO
//QUANTO A UTILIZACAO DE CARACTERES ESPECIAIS NO TERMINAL

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Vaga> listaVagas = new ArrayList<>();
        ArrayList<Candidato> listaCandidatos = new ArrayList<>();
        ArrayList<Endereco> listaEnderecos = new ArrayList<>();
        ArrayList<Contato> listaContatos = new ArrayList<>();
        ArrayList<Recrutador> listaRecrutadores = new ArrayList<>();
        ArrayList<Inscricao> listaInscricoes = new ArrayList<>();



        int opcao, id, idade, numeroEndereco, telefone, candAux, vagaAux;
        String titulo, descricao, nome, logradouro, nomeBairro, email;

        do {
            System.out.printf("===> Sistema de cadastro de VAGAS, CANDIDATOS e RECRUTADORES <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Cadastrar vaga \n"
                    + "2 - Cadastrar Candidato \n"
                    + "3 - Cadastrar Recrutador \n"
                    + "4 - Inscrever Candidato em uma Vaga \n"
                    + "5 - Recrutador dar o Feedback \n"
                    + "6 - Listar Inscricoes \n"
                    + "7 - Sair\n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();

            if (opcao == 1) { //CADASTRAR VAGA
                Vaga vaga = new Vaga();

                id = listaVagas.size() + 1;
                vaga.setId(id);

                System.out.printf("\nDigite o titulo da vaga: ");
                titulo = ler.next();
                vaga.setTitulo(titulo);

                System.out.printf("\nDigite a descricao da vaga: ");
                descricao = ler.next();
                vaga.setDescricao(descricao);

                listaVagas.add(vaga);

                System.out.printf("Vaga cadastrada com sucesso!");
                System.in.read();
            } else if (opcao == 2) { //CADASTRAR CANDIDATO
                Candidato candidato = new Candidato();

                id = listaCandidatos.size() + 1;
                candidato.setId(id);

                System.out.printf("\nDigite o nome do candidato: ");
                nome = ler.next();
                candidato.setNome(nome);

                System.out.printf("\nDigite a idade do candidato: ");
                idade = ler.nextInt();
                candidato.setIdade(idade);

                Endereco endereco = new Endereco();

                id = listaEnderecos.size() + 1;
                endereco.setId(id);

                System.out.printf("\nDigite o nome do endereco: ");
                logradouro = ler.next();
                endereco.setRua(logradouro);

                System.out.printf("\nDigite o numero do endereco: ");
                numeroEndereco = ler.nextInt();
                endereco.setNumero(numeroEndereco);

                System.out.printf("\nDigite o nome do bairro: ");
                nomeBairro = ler.next();
                endereco.setBairro(nomeBairro);

                candidato.setEndereco(endereco);

                Contato contato = new Contato();

                id = listaContatos.size() + 1;
                contato.setId(id);

                System.out.printf("\nDigite o email: ");
                email = ler.next();
                contato.setEmail(email);

                System.out.printf("\nDigite o numero de telefone: ");
                telefone = ler.nextInt();
                contato.setTelefone(telefone);

                candidato.setContato(contato);

                listaCandidatos.add(candidato);

                System.out.printf("Candidato cadastrado com sucesso!");
                System.in.read();
            } else if (opcao == 3) { //CADASTRAR RECRUTADORES
                Recrutador recrutador = new Recrutador();

                id = listaRecrutadores.size() + 1;
                recrutador.setId(id);

                System.out.printf("\nDigite o nome do Recrutador: ");
                nome = ler.next();
                recrutador.setNome(nome);

                listaRecrutadores.add(recrutador);

                System.out.printf("Recrutador cadastrado com sucesso!");
                System.in.read();

            }else if (opcao == 4) { //Inscrever Candidato em uma Vaga
                System.out.println("Digite o id do candidato que deseja inscrever na vaga:");
                for (Candidato a : listaCandidatos) {
                    System.out.println(a.listarCandidato());
                }
                candAux = ler.nextInt();

                System.out.println("Digite o id da vaga que deseja inscrever o candidato:");
                for (Vaga a : listaVagas) {
                    System.out.println(a.listarVaga());
                }
                vagaAux = ler.nextInt();

                for (Candidato c : listaCandidatos) {
                    if (c.getId() == candAux)
                        for (Vaga v : listaVagas) {
                            if (v.getId() == vagaAux){

                                //FALTA ARRUMAR O ID DE INSCRICAO
                                listaInscricoes.add(c.inscreverNaVaga(v));
                                System.out.println("Inscrito com sucesso!");
                            }
                        }
                }

            }else if (opcao == 5) {
                //FALTA FAZER ESSE METODO, MAS AINDA ESTAMOS PENSANDO NA MELHOR FORMA.
                //POR ISSO, FIZEMOS O TESTE DA CLASSE RECRUTADOR E CLASSE INSCRICAO QUE ESTÁ COMENTADO ABAIXO SEM
                // UTILIZAÇÃO DE METODO.

            }else if (opcao == 6) {
                for (Inscricao i :listaInscricoes) {
                    if (i.getFeedback() == null){
                        System.out.println(i.listarInscricoesSemFeedback());
                    }else{
                        System.out.println(i.listarInscricoes());
                    }
                }
                System.in.read();
            }
        } while (opcao != 7);
        ler.close();



//        Vaga vagaJr = new Vaga(1, "Dev Jr", "Ser um Desenvolvedor Júnior na IBM");
//        Vaga vagaPl = new Vaga(2, "Dev Pleno", "Ser um Desenvolvedor Pleno na IBM");
//        Vaga vagaSr = new Vaga(3, "Dev Sênior", "Ser um Desenvolvedor Sênior na IBM");
//
//        Candidato candidatoUm = new Candidato(1, "Jakeline", 21,
//                                                new Contato(1, "jakeline@jake", 1196666),
//                                                new Endereco(1, "Rua Oito", 23, "Guaianases"));
//
//        Candidato candidatoDois = new Candidato(2, "Lucas", 24,
//                                                new Contato(2, "lucas@lucas", 1190000),
//                                                new Endereco(2, "Rua Nove", 222, "Robru"));
//
//        Candidato candidatoTres = new Candidato(3, "Gabriel", 22,
//                                                new Contato(3, "gabriel@gab", 1198888),
//                                                new Endereco(3, "Rua Dez", 33, "Itaquera"));
//
//
//
//        Recrutador recrutador = new Recrutador(1, "Fatima");
//
//
//        Inscricao inscricao = candidatoUm.inscreverNaVaga(vagaSr);
//        recrutador.darFeedback(inscricao, "Sinto muito, você foi reprovado!");
//
//
//        Inscricao inscricao2 = candidatoDois.inscreverNaVaga(vagaPl);
//        recrutador.darFeedback(inscricao2, "Parabens, você foi aprovado!");
//
//        System.out.println(inscricao.getCandidato().getEndereco().getBairro());
    }
}