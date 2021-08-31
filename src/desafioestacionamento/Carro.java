package desafioestacionamento;

public class Carro {
    private String cor;
    private String placa;
    private String velocidadeMax;

    public Carro(String cor, String placa, String velocidadeMax){
        this.cor = cor;
        this.placa = placa;
        this.velocidadeMax = velocidadeMax;
    }

    public String getCor() {
        return this.cor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getVelocidadeMax() {
        return this.velocidadeMax;
    }




}
