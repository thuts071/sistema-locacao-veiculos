package Trabalho_Arthur_Pereira_POO;

public class CarroPasseio extends Veiculo{

    private int quantidadePortas;
    private boolean arCondicionado;

    private static final double TAXA_SEGURO_DIARIA=50.0;

    public CarroPasseio(String placa, double valorDiariaBase, String modelo, Cliente locatario, int quantidadePortas, boolean arCondicionado) {
        super(placa, valorDiariaBase, modelo, locatario);
        this.quantidadePortas=quantidadePortas;
        this.arCondicionado=arCondicionado;

    }

    public int getQuantidadePortas(){
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas){
        this.quantidadePortas=quantidadePortas;
    }

    public boolean isArCondicionado(){
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado){
        this.arCondicionado=arCondicionado;
    }

    @Override 
    public double calcularValorLocacao(int dias){
        //valor da locação = (diária base + taxa de seguro fixa)* dias

        return(getValorDiariaBase()+TAXA_SEGURO_DIARIA)*dias;
    }

    @Override
    public void exibirFichaDetalhada(){
        System.out.println("==== Ficha do Carro de Passeio ====");
        System.out.println("-Placa: "+getPlaca());
        System.out.println("-Modelo: "+ getmodelo());
        System.out.println("Diária Base; "+getValorDiariaBase());
        System.out.println("Portas: " + quantidadePortas);
        System.out.println("Ar condicionado: "+ (arCondicionado ? "Sim" : "Não"));
        System.out.println("Taxa de seguro /dia: " + String.format("%.2f",TAXA_SEGURO_DIARIA));
        System.out.println("Locatário: "+(getlocatario() != null ? getlocatario().getLocatario() : "Nenhum"));

        System.out.println("=====================================");


    }

}