package fja.edu.br.observer;

import java.text.DecimalFormat;


public class PorcentoObserver extends DadosObserver{

    public PorcentoObserver(DadosSubject dados) {
        super(dados);
    }
    
    
    @Override
    public void update() {
        int soma = dados.getEstado().valora + dados.getEstado().valorb + dados.getEstado().valorc;
        
        DecimalFormat df = new DecimalFormat("###.##");
        
        String perca = df.format((double) ((double)(dados.getEstado().valora / (double)soma)*(double)100) );
        String percb = df.format((double) ((double)(dados.getEstado().valorb / (double)soma)*(double)100) );
        String percc = df.format((double) ((double)(dados.getEstado().valorc / (double)soma)*(double)100) );
        
        System.out.println("Porcentágem:");
        System.out.println("Valor A: " + perca + "%");
        System.out.println("Valor B: " + percb + "%");
        System.out.println("Valor C: " + percc + "%");
        System.out.println("----------------------");
    }
    
}
