package fja.edu.br.observer;


public class TabelaObserver extends DadosObserver{

    public TabelaObserver(DadosSubject dados) {
        super(dados);
    }
    
    @Override
    public void update() {
        System.out.println("TABELA");
        System.out.println("-------------------------------");
        System.out.println("| VALOR A | " + dados.getEstado().valora + " |");
        System.out.println("| VALOR B | " + dados.getEstado().valorb + " |");
        System.out.println("| VALOR C | " + dados.getEstado().valorc + " |");
        System.out.println("-------------------------------");
        
    }
    
}
