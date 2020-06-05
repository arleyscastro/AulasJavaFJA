package templatemethod;

import java.util.ArrayList;


public class PlayList {
    private ArrayList<MusicaMp3> musicas;
    private OrdenadorTemplate ordenador;

    public PlayList(ModoDeReproducao modo) {
        musicas = new ArrayList<MusicaMp3>();
        switch(modo){
            case porAno:
                ordenador = new OrdenadorPorAno();
                break;
            case porEstrela:
                ordenador = new OrdenadorPorEstrela();
                break;
            case porAlbum:
                ordenador = new OrdenadorPorAlbum();
                break;
            case porAutor:
                ordenador = new OrdenadorPorAutor();
                break;
            case porNome:
                ordenador = new OrdenadorPorNome();
                break;
        }
    }
    
    public void setModoDeReproducao(ModoDeReproducao modo){
        switch(modo){
            case porAno:
                ordenador = new OrdenadorPorAno();
                break;
            case porEstrela:
                ordenador = new OrdenadorPorEstrela();
                break;
            case porAlbum:
                ordenador = new OrdenadorPorAlbum();
                break;
            case porAutor:
                ordenador = new OrdenadorPorAutor();
                break;
            case porNome:
                ordenador = new OrdenadorPorNome();
                break;
        }
    }
    
    public void adicionaMusica(String nome, String autor, String album, int ano, int estrelas){
        musicas.add(new MusicaMp3(nome, autor, album, ano, estrelas));
    }
    
    public void imprimirListaDeReproducao(){
       ArrayList<MusicaMp3> novaLista = new ArrayList<MusicaMp3>();
       novaLista = ordenador.ordenaMusica(musicas);
       
        for (MusicaMp3 musica : novaLista) {
            System.out.println(musica.getNome() + " - " + musica.getAutor() + " - " +
                               musica.getAlbum() + " - " + musica.getAno() + " - " + musica.getEstrelas());
        }
    }
}
