package fja.edu.br;


public class Carro {
    private String chassi;
    private String placa;
    private int ano;
    
    public Carro(){
        this.ano = 1990;
    }
    
    public Carro(String chassi, String placa, int ano){
        this.chassi = chassi;
        this.placa = placa;
        this.ano = ano;
    }

    @Override
    public String toString() {
        String texto;
        texto = "Chassi :" + this.chassi +
                "\n Placa :" + this.placa +
                "\n Ano :" + this.ano +
                "\n Idade :" + obtemIdadeDoCarro();
        return texto;
    }
    
    
    
    public void mudaPlaca(String placa){
        this.placa = placa;
    }
    
    public String obtemPlaca(){
        return this.placa;
    }
    
    public void mudaChassi(String chassi){
        this.chassi = chassi;
    }
    
    public String obtemChassi(){
        return chassi;
    }
    
    public void mudaAno(int ano){
        this.ano = ano;
    }
    public int obtemAno(){
        return ano;
    }
    
    public int obtemIdadeDoCarro(){
        return 2020 - ano;
    }
}
