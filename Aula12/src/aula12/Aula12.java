package aula12;

import fja.edu.br.observer.BarraObserver;
import fja.edu.br.observer.Dados;
import fja.edu.br.observer.DadosSubject;
import fja.edu.br.observer.PorcentoObserver;
import fja.edu.br.observer.TabelaObserver;


public class Aula12 {

    public static void main(String[] args) {
        
        DadosSubject dados = new DadosSubject();
        dados.incluir(new TabelaObserver(dados));
        dados.incluir(new PorcentoObserver(dados));
        dados.incluir(new BarraObserver(dados));
        
        dados.setEstado(new Dados(6, 3, 1));
        dados.setEstado(new Dados(5, 8, 15));
        dados.setEstado(new Dados(8, 1, 8));
        dados.setEstado(new Dados(12, 20, 3));
        
    }
    
}
