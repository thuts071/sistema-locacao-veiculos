package Trabalho_Arthur_Pereira_POO;

public abstract class Veiculo {
    
    private String placa;
    private double valorDiariaBase;
    private String modelo;
    private Cliente locatario;

    // Etapa de encapsulamento: 

    public Veiculo (String placa, double valorDiariaBase, String modelo, Cliente locatario){
        this.placa=placa;
        this.valorDiariaBase=valorDiariaBase;
        this.modelo=modelo;
        this.locatario=locatario;
    }

    //Getters - Setters

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa=placa;
    }

    public double getValorDiariaBase(){
        return valorDiariaBase;
    }

    protected void setValorDiariaBase(double valorDiariaBase){
        if (valorDiariaBase<=0){
            // Verificação para não permitir um valor de diária gratuito
            throw new IllegalArgumentException("O valor da diária não pode ser 0 ou menos que isso");
        }
        this.valorDiariaBase=valorDiariaBase;
    }

    public String getmodelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public Cliente getlocatario(){
        return locatario;
    }
    
    public void associarLocatario (Cliente cliente){
        //verifica se o veículo já está ocupado por algum locatário

        if (this.locatario != null){
            throw new IllegalArgumentException("O veículo de placa "+placa+" já está alugado para "+this.locatario.getLocatario());
        }
        this.locatario=cliente;
    }

    //Libera o veículo para um novo locatário

    public void liberarVeiculo(){
        this.locatario=null;
    }

    public boolean isDisponivel(){
        return this.locatario==null;
    }

    //métodos obrigatórios:

    public abstract double calcularValorLocacao(int dias);
    public abstract void exibirFichaDetalhada();

}
