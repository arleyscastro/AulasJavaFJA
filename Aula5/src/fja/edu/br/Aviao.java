package fja.edu.br;

import java.util.LinkedList;
import java.util.List;


public class Aviao {
    //Composição  
    private Motor motor = new Motor(5000, "Sharp", "Rotativo contínuo");
    
    private List<Poltrona> poltronas = new LinkedList<Poltrona>();

    public Aviao() {
        int cont=1;
        for(int i = 1; i<=130; i++){
            switch(cont){
                case 1:
                    poltronas.add(new Poltrona(i, "J", "Econômica", new Passageiro()));
                    cont++;
                    break;
                case 2:
                    poltronas.add(new Poltrona(i, "M", "Econômica", new Passageiro()));
                    cont++;
                    break;
                case 3:
                    poltronas.add(new Poltrona(i, "C", "Econômica", new Passageiro()));
                    cont=1;                    
                    break;
            }
        }
    }
    
    
    public Motor getMotor(){
        return motor;
    }
    
    public Poltrona getPoltrona(int nrpoltrona){
        return poltronas.get(nrpoltrona);
    }
    
    //Agregação
    public void add(Passageiro passageiro){
        poltronas.get(passageiro.getNrpoltrona()).setPassageiro(passageiro);
        
//        for (Poltrona poltrona : poltronas) {
//            if (poltrona.getNumero() == passageiro.getNrpoltrona()){
//                poltrona.setPassageiro(passageiro);
//                break;
//            }
//        }
        passageiro.embarque(this);
    }
    
    
}
