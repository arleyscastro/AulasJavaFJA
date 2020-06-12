package fja.edu.br.observer;


public class BarraObserver extends DadosObserver{

    public BarraObserver(DadosSubject dados) {
        super(dados);
    }

    
    
    @Override
    public void update() {
        String barra1 = "";
        String barra2 = "";
        String barra3 = "";
        
        for(int i = 0; i < dados.getEstado().valora; i++){
            barra1 +="=";
        }
        for(int i = 0; i < dados.getEstado().valorb; i++){
            barra2 +="=";
        }
        for(int i = 0; i < dados.getEstado().valorc; i++){
            barra3 +="=";
        }
        
        System.out.println("Barras:");
        System.out.println("Valor A:|" + barra1 );
        System.out.println("Valor B:|" + barra2 );
        System.out.println("Valor C:|" + barra3 );
        System.out.println("--------------------------");
        
    }
    
}
