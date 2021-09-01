package desafioestacionamento;

import java.util.Scanner;

public class EstacionamentoController {
    private Estacionamento estacionamento = new Estacionamento();
    private String resposta = null;
    private String controlador = null;
    private Scanner scanner = new Scanner(System.in);

    public void Controller() throws Exception {



        System.out.println("Bem vindo ao nosso sistema de cadastro de estacionamento. \nAtualmente temos " + this.estacionamento.getTotalVagas() + " vagas\n");



        String menuSwitch = printMenu();
        while (!(menuSwitch.equals("nao") ||
                 menuSwitch.equals("não") ||
                 menuSwitch.equals("Não") ||
                 menuSwitch.equals("Nao"))) {

            switch (menuSwitch){
                case "sim":
                    System.out.println("Digite a cor do seu carro");
                    String cor = this.scanner.nextLine();
                    System.out.println("Digite a placa do seu carro");
                    String placa = this.scanner.nextLine();
                    System.out.println("Digite a velocidade máxida do seu carro");
                    String velocidadeM = this.scanner.nextLine();

                    this.resposta = this.estacionamento.addCarro(new Carro(cor,placa,velocidadeM));
                    System.out.println(this.resposta);

                    System.out.println("Vagas disponíveis: " + (this.estacionamento.getTotalVagas() - this.estacionamento.size()) + "\n");


                    menuSwitch = printMenu();
                    break;
                case "remover":
                    System.out.println("Digite o número da vaga que deseja remover o carro");
                    Integer index = new Scanner(System.in).nextInt();
                    this.resposta = this.estacionamento.removeCarro(index);
                    System.out.println(resposta+ "\n");

                    menuSwitch = printMenu();
                    break;
                default:
                    System.out.println("Opção não é válida. Porfavor digite uma das opçoes do Menu");

                    menuSwitch = printMenu();
                    break;
            }
        }

        System.out.println("\nCarros:\n");
        this.estacionamento.getListaCarrosEstacionamento().stream().forEach(carro -> System.out.println("Carro numero: " + "\n" +
                "Cor: " + carro.getCor() + "\n" +
                "Placa: " + carro.getPlaca() + "\n" +
                "Velocidade Máxima: " + carro.getVelocidadeMax() + "\n"));



        //            resposta = estacionamento.addCarro(new Carro("Verde", "00000001", "180 KM"));
//            System.out.println(resposta);
//            resposta = estacionamento.addCarro(new Carro("Azul", "00000002", "200 KM"));
//            System.out.println(resposta);
//            resposta = estacionamento.addCarro(new Carro("Rosa", "00000003", "80 KM"));
//            System.out.println(resposta);
//            resposta = estacionamento.addCarro(new Carro("Preto", "00000004", "250 KM"));
//            System.out.println(resposta);
//            resposta = estacionamento.addCarro(new Carro("Cinza", "00000005", "300 KM"));
//            System.out.println(resposta);
//            resposta = estacionamento.addCarro(new Carro("Roxo", "00000006", "120 KM"));
//            System.out.println(resposta);
//            resposta = estacionamento.addCarro(new Carro("Branco", "00000007", "150 KM"));
//            System.out.println(resposta);
//            resposta = estacionamento.addCarro(new Carro("Branco", "00000007", "150 KM"));
//            System.out.println(resposta);

        //        for (int i = 0; i < estacionamento.size(); i++) {
        //    System.out.println("Carro numero: " + (i + 1));
        //    System.out.println("Cor: " + estacionamento.getCarro(i).getCor());
//            System.out.println("Placa: " + estacionamento.getCarro(i).getPlaca());
//            System.out.println("Velocidade Máxima: " + estacionamento.getCarro(i).getVelocidadeMax() + "\n");
//        }

        // estacionamento.clear();

        //        System.out.println("Digite \"sim\" para cadastrar um carro no estacionamento");
//        this.controlador = this.scanner.nextLine();
//        while (this.controlador.equals("sim")){
//            System.out.println("Digite a cor do seu carro");
//            String cor = this.scanner.nextLine();
//            System.out.println("Digite a placa do seu carro");
//            String placa = this.scanner.nextLine();
//            System.out.println("Digite a velocidade máxida do seu carro");
//            String velocidadeM = this.scanner.nextLine();
//
//            this.resposta = this.estacionamento.addCarro(new Carro(cor,placa,velocidadeM));
//            System.out.println(this.resposta);
//
//            System.out.println("Vagas disponíveis: " + (this.estacionamento.getTotalVagas() - this.estacionamento.size()));
//            System.out.println("Digite \"sim\" para cadastrar outro carro");
//            this.controlador = this.scanner.nextLine();
//        }
//
    }

    private String printMenu() {
        System.out.println("*Menu Estacionamento*");
        System.out.println("Digite \"sim\" para cadastrar seu veículo no estacionamento");
        System.out.println("Digite \"não\" para sair do Menu");
        System.out.println("Digite \"remover\" para tirar seu carro do estacionamento");
        String input;
        return input = this.scanner.nextLine();
    }
}
