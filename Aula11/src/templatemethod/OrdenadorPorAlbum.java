
package templatemethod;


public class OrdenadorPorAlbum extends OrdenadorTemplate{

    @Override
    public boolean isPrimeiro(MusicaMp3 musica1, MusicaMp3 musica2) {
        if(musica1.getAlbum().compareToIgnoreCase(musica2.getAlbum()) <= 0)
            return true;
        
        return false;
    }
    
}
