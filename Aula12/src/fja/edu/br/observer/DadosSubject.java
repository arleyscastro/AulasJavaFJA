package fja.edu.br.observer;

import java.util.ArrayList;


public class DadosSubject {
    
    protected ArrayList<DadosObserver> observadores;
    private Dados dado;

    public DadosSubject() {
        observadores = new ArrayList<DadosObserver>();
    }
    
    public void incluir(DadosObserver observador){
        observadores.add(observador);
    }
    
    public void remover(int indice){
        observadores.remove(indice);
    }
    
    public Dados getEstado(){
        return dado;
    }
    
    public void setEstado(Dados dado){
       this.dado = dado;
       notificaTodoMundo();
    }
    
    private void notificaTodoMundo(){
        for (DadosObserver observador : observadores) {
            observador.update();
        }
    }
    
}
