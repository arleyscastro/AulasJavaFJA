package fja.edu.br.observer;


public abstract class DadosObserver {

    protected DadosSubject dados;
    
    public DadosObserver(DadosSubject dados) {
        this.dados = dados;
    }
        
    public abstract void update();
}
