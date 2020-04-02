package aula3;

import fja.edu.br.heranca.Circulo;
import fja.edu.br.heranca.Ponto;

public class Aula3 {

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto(30, 40);
        Ponto ponto2 = new Ponto();
        
        System.out.println(ponto1);
        System.out.println(ponto2);
        
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(3.14F, 20, 50);
        
        System.out.println(circulo1);
        System.out.println(circulo2);
        
        
        Ponto p1, p2;
        Circulo c1, c2;
        
        p1 = new Ponto(10, 15);
        c1 = new Circulo(1.34F, 50, 60);
        //Processo de COERÇÃO(CONVERSÃO) de super para sub
        //Usa a máxima "É UMA"
        p2 = c1;
        System.out.println(p2);
        
        //Processo do sub para o super
        c2 = (Circulo)p2;
        System.out.println(c2);
        
        if(p2 instanceof Circulo){
            System.out.println("É círculo");
        }else{
            System.out.println("Não é círculo");
        }
        
        
    }
    
}
