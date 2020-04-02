package aula5;

import fja.edu.br.Aviao;
import fja.edu.br.Passageiro;
import fja.edu.br.Poltrona;


public class Aula5 {


    public static void main(String[] args) {
        // AVIÃO COMERCIAL
        // MOTOR   PASSAGEIRO
        //
        Passageiro passageiro = new Passageiro();
        passageiro.setNome("Joisé das Couves");
        passageiro.setNrpoltrona(45);
        
        Aviao aviao = new Aviao();
        aviao.add(passageiro);
        
        aviao.add(new Passageiro("Maria aparecida", 17));
        
        Poltrona po = aviao.getPoltrona(45);
        
        System.out.println("Passageiro :" + po.getPassageiro().getNome() );
        System.out.println("Passageiro :" + aviao.getPoltrona(17).getPassageiro().getNome());
        
        
    }
    
}
