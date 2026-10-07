package Trabalho_Arthur_Pereira_POO;

import java.util.ArrayList;

public class Locadora {

    private ArrayList<Veiculo>frota;

    public Locadora(){
        this.frota=new ArrayList<>();
    }
    
    public void cadastrarVeiculo(Veiculo veiculo){
        if (buscarPorPlaca(veiculo.getPlaca())!=null){
            System.out.println("Ja existe um veiculo cadastrado com a placa "+veiculo.getPlaca());
            return;
        }
        frota.add(veiculo);
        System.out.println("Veiculo de placa: "+veiculo.getPlaca()+" cadastrado com sucesso!");
    }

    //busca do veiculo pela placa, se não encontrar retorna null

    public Veiculo buscarPorPlaca(String placa){
        for(Veiculo v : frota){
            if(v.getPlaca().equalsIgnoreCase(placa)){
                return v;
            }
        }
        return null;
    }

    //listagem do relatório em cada caso, se for carro imprime diferente de caminhão

    public void listarVeiculos(){
        if(frota.isEmpty()){
            System.out.println("Nenhum veículo cadastrado na frota");
            return;
        }
        for(Veiculo v : frota){
            v.exibirFichaDetalhada();
        }
    }

    //Calcula o faturamento total da frota

    public double calcularFaturamentoTotal(int dias){
        double total = 0;
        for (Veiculo v : frota){
            total += v.calcularValorLocacao(dias);
        }
        return total;
    }
    public ArrayList<Veiculo>getFrota(){
        return frota;
    }
}
