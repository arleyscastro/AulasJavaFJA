package templatemethod;


public class OrdenadorPorNome extends OrdenadorTemplate{

    @Override
    public boolean isPrimeiro(MusicaMp3 musica1, MusicaMp3 musica2) {
        if(musica1.getNome().compareToIgnoreCase(musica2.getNome()) <= 0)
            return true;
        
        return false;
    }
    
}
