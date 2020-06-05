package templatemethod;


public class OrdenadorPorAutor extends OrdenadorTemplate{

    @Override
    public boolean isPrimeiro(MusicaMp3 musica1, MusicaMp3 musica2) {
        if(musica1.getAutor().compareToIgnoreCase(musica2.getAutor()) <= 0)
            return true;
        
        return false;
    }
    
}
