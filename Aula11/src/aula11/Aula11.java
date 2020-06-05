package aula11;

import templatemethod.ModoDeReproducao;
import templatemethod.PlayList;

public class Aula11 {


    public static void main(String[] args) {
        PlayList minhaPl = new PlayList(ModoDeReproducao.porNome);
        minhaPl.adicionaMusica("Everlong", "Foo Figthers", "Grand", 1997, 5);
        minhaPl.adicionaMusica("Song 2", "Blur", "Mama", 1997, 4);
        minhaPl.adicionaMusica("Amarican Jesus", "Bad Religion", "Mad", 1993, 3);
        minhaPl.adicionaMusica("No Cigar", "Milencollin", "Hit", 2001, 2);
        minhaPl.adicionaMusica("Song Of Songs", "Milencollin", "Hit", 2001, 3);
        minhaPl.adicionaMusica("Tchan", "Cumpadi Uochinton", "Loira", 1998, 0);
        
        
        System.out.println("======= Lista por nome =========");
        minhaPl.imprimirListaDeReproducao();
        
        System.out.println("======= Lista por Ano =========");
        minhaPl.setModoDeReproducao(ModoDeReproducao.porAno);
        minhaPl.imprimirListaDeReproducao();
        
        System.out.println("======= Lista por estrelas =========");
        minhaPl.setModoDeReproducao(ModoDeReproducao.porEstrela);
        minhaPl.imprimirListaDeReproducao();
    }
    
}
