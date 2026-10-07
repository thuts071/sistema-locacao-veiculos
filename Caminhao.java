package Trabalho_Arthur_Pereira_POO;

public class Caminhao extends Veiculo {
    
    private double capacidadeCargaToneladas;
    private int numeroEixos;

    //Cálculo da locação pelo número de eixos

    private static final double VALOR_POR_TONELADA =20.0; //R$ por tonelada de capacidade
    private static final double VALOR_POR_EIXO = 40.0; //R$ por eixo

    public Caminhao(String placa, double valorDiariaBase, String modelo, Cliente locatario, double capacidadeCargaToneladas, int numeroEixos){
        super(placa, valorDiariaBase, modelo, locatario);
        this.capacidadeCargaToneladas=capacidadeCargaToneladas;
        this.numeroEixos=numeroEixos;
    }

    //getters e setters

    public double getCapacidadeCargaToneladas(){
        return capacidadeCargaToneladas;
    }
    public void setCapacidadeCargaToneladas(double capacidadeCargaToneladas){
        this.capacidadeCargaToneladas=capacidadeCargaToneladas;
    }

    public int getNumeroEixos(){
        return numeroEixos;
    }
    public void setNumeroEixos(int numeroEixos){
        this.numeroEixos=numeroEixos;
    }

    private double calcularSobretaxaDiaria(){
        return (capacidadeCargaToneladas*VALOR_POR_TONELADA)+(numeroEixos*VALOR_POR_EIXO);
    }

    //sobrescrevendo métodos da classe mãe

    @Override 
    public double calcularValorLocacao(int dias){
        double sobretaxaDiaria= calcularSobretaxaDiaria();
        return (getValorDiariaBase()+sobretaxaDiaria)*dias;
    }

    @Override 
    public void exibirFichaDetalhada(){
        System.out.println("==== FICHA DO CAMINHAO ====");
        System.out.println("-Placa: "+getPlaca());
        System.out.println("-Modelo: "+getmodelo());
        System.out.println("-Diária Base: "+getValorDiariaBase());
        System.out.println("-Capacidade de Carga: "+getCapacidadeCargaToneladas()+ (" toneladas"));
        System.out.println("-Número de Eixos: "+ getNumeroEixos());
        System.out.println("Sobretaxa/dia: R$"+String.format("%.2f",calcularSobretaxaDiaria()));
        System.out.println("Locatário: "+(getlocatario() != null ? getlocatario().getLocatario() : "Nenhum"));
        
    }
}
