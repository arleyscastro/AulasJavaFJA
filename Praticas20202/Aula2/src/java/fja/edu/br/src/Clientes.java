package fja.edu.br.src;

import java.util.LinkedList;
import java.util.List;


public class Clientes {
    private List<Pessoa> pessoas = null;

    public Clientes() {
        pessoas = new LinkedList<Pessoa>();
    }

    public List<Pessoa> getPessoas() {
        
        int i;
        
        for(i=0;i<20;i++){
            pessoas.add( new Pessoa("Pessoa " + i, 90+1, 1.8F + ((float)i/10), (float)i) );
        }
        
        return pessoas;
    }

    
    
}
