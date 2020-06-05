package templatemethod;


public class OrdenadorPorAno extends OrdenadorTemplate{

    @Override
    public boolean isPrimeiro(MusicaMp3 musica1, MusicaMp3 musica2) {
        if(musica1.getAno()> musica2.getAno())
            return true;
        
        return false;
        
    }
    
}
