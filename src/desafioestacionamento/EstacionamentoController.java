package desafioestacionamento;

import java.util.Scanner;

public class EstacionamentoController {
        private Estacionamento estacionamento = new Estacionamento();
        private String resposta = null;
        private String controlador = null;
        private Scanner scanner = new Scanner(System.in);

    public void Controller() throws Exception {



        System.out.println("Bem vindo ao nosso sistema de cadastro de estacionamento. \nAtualmente temos " + this.estacionamento.getTotalVagas() + " vagas\n");
        System.out.println("Digite \"sim\" para cadastrar um carro no estacionamento");
        this.controlador = this.scanner.nextLine();
        while (this.controlador.equals("sim")){
            System.out.println("Digite a cor do seu carro");
            String cor = this.scanner.nextLine();
            System.out.println("Digite a placa do seu carro");
            String placa = this.scanner.nextLine();
            System.out.println("Digite a velocidade máxida do seu carro");
            String velocidadeM = this.scanner.nextLine();

            this.resposta = this.estacionamento.addCarro(new Carro(cor,placa,velocidadeM));
            System.out.println(this.resposta);

            System.out.println("Vagas disponíveis: " + (this.estacionamento.getTotalVagas() - this.estacionamento.size()));
            System.out.println("Digite \"sim\" para cadastrar outro carro");
            this.controlador = this.scanner.nextLine();
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

    }
}
