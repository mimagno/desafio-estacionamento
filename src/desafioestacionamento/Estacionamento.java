package desafioestacionamento;

import java.util.*;

public class Estacionamento {
    private Integer vagas = 0;
    private Integer totalVagas=7;
    private List<Carro> listaCarrosEstacionamento = new Vector<>();

    public String addCarro(Carro carro) throws Exception {

        if (this.vagas<totalVagas) {
            this.listaCarrosEstacionamento.add(carro);
            this.vagas++;
            return "Carro estacionado na vaga: " + vagas;
        } else {
            throw new Exception("Nao foi possível estacionar o carro com a placa: " + carro.getPlaca() + "\nLimite de vagas alcançado. Porfavor tente mais tarde.");
        }
    }

    public void removeCarro(int index){
        this.listaCarrosEstacionamento.remove(index);
    }

    public Carro getCarro(int index){
        return this.listaCarrosEstacionamento.get(index);
    }

    public int size(){
        return this.listaCarrosEstacionamento.size();
    }

    public void clear(){
        this.listaCarrosEstacionamento.clear();
    }

    public List<Carro> getListaCarrosEstacionamento(){
        return listaCarrosEstacionamento;
    }

    public Integer getTotalVagas(){
        return totalVagas;
    }
}
