package aula10;

import aula10.fja.edu.br.adapter.ImagemTarget;
import aula10.fja.edu.br.adapter.OpenGlAdapter;
import aula10.fja.edu.br.adapter.SdlAdapter;
import aula10.fja.edu.br.singleton.Pessoa;


public class Aula10 {

    
    public static void main(String[] args) {
        Pessoa p1 = Pessoa.getInstancia();
        Pessoa p2 = Pessoa.getInstancia();
        
        p1.setNome("João");
        p1.setIdade(25);
        p1.setCpf("J-123456789");
        
        p2.setNome("Maria");
        p2.setIdade(22);
        p2.setCpf("M-987654321");
        
        Pessoa pn = Pessoa.getInstancia();
        
        
        System.out.println("PESSOA P1:" + p1 );
        System.out.println("PESSOA P2:" + p2 );
        
        
        pn.setNome("MELEKA");
        
        System.out.println("Pessoa P1: " + p1.getNome() + ", " + p1.getIdade() + ", " + p1.getCpf());
        System.out.println("Pessoa P2: " + p2.getNome() + ", " + p2.getIdade() + ", " + p2.getCpf());
        
        /* *********************************************************************** */
        
        ImagemTarget imagem = new SdlAdapter();
        imagem.carregarImagem("Figura.png");
        imagem.desenharImagem(0, 1, 5, 25);
        
        imagem = new OpenGlAdapter();
        imagem.carregarImagem("Imagem.jpg");
        imagem.desenharImagem(1, 7, 14, 60);
                
    }
    
}

