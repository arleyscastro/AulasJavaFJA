package aula2;

import fja.edu.br.Carro;
import fja.edu.br.Pessoa;

public class Aula2 {
 
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro("POIU8765", "ASD-1234", 2019);
        
        System.out.println(carro2);
        
        System.out.println(carro.obtemIdadeDoCarro());
        
        carro.mudaAno(2015);
        carro.mudaChassi("XPTO012345");
        carro.mudaPlaca("QWE-9876");
        
        System.out.println("Chassi :" + carro.obtemChassi());
        System.out.println("Placa :" + carro.obtemPlaca());
        System.out.println("Ano de fabricação :" + carro.obtemAno());
        System.out.println("Idade do carro :" + carro.obtemIdadeDoCarro());
        
        System.out.println(carro.toString());
        
        Pessoa pessoa = new Pessoa("344", 
                "9777",
                "Ze"
                , 1998, 82.34F,
                1.83F, "Brasileiro");
        
        System.out.println(pessoa);
    }
    
}
