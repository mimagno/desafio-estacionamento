package desafioestacionamento;

import java.util.Locale;
import java.util.Scanner;

public class EstacionamentoController {
    private Estacionamento estacionamento = new Estacionamento();
    private String resposta = null;
    private String controlador = null;
    private Scanner scanner = new Scanner(System.in);

    public void Controller() throws Exception {
        this.cadastrarCarro();

        if(!this.estacionamento.isEmpty()) {
            System.out.println("\nCarros:\n");
            this.estacionamento.getListaCarrosEstacionamento().stream().forEach(carro -> System.out.println(
                    "Número da Vaga: " + (this.estacionamento.getListaCarrosEstacionamento().indexOf(carro) + 1) + "\n" +
                            carro.toString()));
        }
    }

    private void cadastrarCarro() throws Exception {
        System.out.println("Bem vindo ao nosso sistema de cadastro de estacionamento. \nAtualmente temos " + this.estacionamento.getTotalVagas() + " vagas\n");
        String menuSwitch = this.printMenu();
        while (!(menuSwitch.equalsIgnoreCase("Não") ||
                 menuSwitch.equalsIgnoreCase("Nao") ||
                 menuSwitch.equalsIgnoreCase("N"))) {

            switch (menuSwitch.toLowerCase(Locale.ROOT)) {

                case "sim":
                    System.out.println("Digite a cor do seu carro");
                    String cor = this.scanner.nextLine();
                    System.out.println("Digite a placa do seu carro");
                    String placa = this.scanner.nextLine();
                    System.out.println("Digite a velocidade máxida do seu carro");
                    String velocidadeM = this.scanner.nextLine();

                    this.resposta = this.estacionamento.addCarro(new Carro(cor, placa, velocidadeM));
                    System.out.println(this.resposta);

                    System.out.println("Vagas disponíveis: " + (this.estacionamento.getTotalVagas() - this.estacionamento.size()) + "\n");

                    menuSwitch = this.printMenu();
                    break;

                case "remover":
                    System.out.println("Digite o número da vaga que deseja remover o carro");
                    Integer index = new Scanner(System.in).nextInt();
                    this.resposta = this.estacionamento.removeCarro(index);
                    System.out.println(resposta + "\n");

                    menuSwitch = this.printMenu();
                    break;

                default:
                    System.out.println("Opção não é válida. Porfavor digite uma das opçoes do Menu");

                    menuSwitch = this.printMenu();
                    break;

            }
        }
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
