package fja.edu.br;


public class Passageiro {
    private String nome;
    private Aviao voo;
    private int nrpoltrona;

    public Passageiro() {
    }

    public Passageiro(String nome, int nrpoltrona) {
        this.nome = nome;
        this.nrpoltrona = nrpoltrona;
    }

    public int getNrpoltrona() {
        return nrpoltrona;
    }

    public void setNrpoltrona(int nrpoltrona) {
        this.nrpoltrona = nrpoltrona;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void embarque(Aviao aviao){
        //Código para incluir em um plano de voo
        voo = aviao;
    }
    
    public void desembarque(Aviao aviao){
        //Código para remover da lista de passageiros
        voo = aviao;
    }
    
}
