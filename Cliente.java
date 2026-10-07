package Trabalho_Arthur_Pereira_POO;

public class Cliente {
    
    private String locatario;
    private String cpf;
    private String cnh;

    public Cliente(String locatario, String cpf, String cnh){
        this.locatario=locatario;
        this.cpf=cpf;
        this.cnh=cnh;
    }

    public String getLocatario(){
        return locatario;
    }

    public void setLocatario(String locatario){
        this.locatario=locatario;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public String getCnh(){
        return cnh;
    }

    public void setCnh(String cnh){
        this.cnh=cnh;
    }

    @Override 
    public String toString(){
        return locatario + ("CPF: "+cpf+ "   CNH: "+cnh);
    }
}
