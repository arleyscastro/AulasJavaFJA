package aula6;

import fja.edu.br.ChaveInglesa;
import fja.edu.br.Divisao;
import fja.edu.br.Martelo;


public class Aula6 {


    public static void main(String[] args) {
        
        Divisao div = new Divisao(-500, 0);
        
        
        System.out.println("INICIO");
        div.divide();
        System.out.println("FIM - NO MAIN");
        //-------------------------------------------- //
        
        
        Martelo m1 = new Martelo("Prego pequeno", 50, 30);
        Martelo m2 = new Martelo("Prego grande", 50, 30);
        
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.setPriority(Thread.MIN_PRIORITY);
        
        m2.start();
        m1.start();
        
        ChaveInglesa c1 = new ChaveInglesa("porca pequena", 50, 30);
        ChaveInglesa c2 = new ChaveInglesa("porca grande", 50, 30);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        
        t1.start();
        t2.start();
        
        
    }
    
}
