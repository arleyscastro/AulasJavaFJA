package aula4;

import fja.edu.br.contratos.ICalculoJuros;
import fja.edu.br.implementacao.BancoDoBrasil;
import fja.edu.br.implementacao.CaixaEconomica;


public class Aula4 {


    public static void main(String[] args) {
        
        ICalculoJuros banco;
        
        banco = new BancoDoBrasil(0.1F);
        
              
        
        double meuvalor = calculoSimples(banco, 500.00F);

        System.out.println(meuvalor);
        
    }
        
    public static double calculoSimples(ICalculoJuros calc, double valor){
        return calc.calculoJurosSimples(valor);
    }
    
}
