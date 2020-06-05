package templatemethod;


public class OrdenadorPorEstrela extends OrdenadorTemplate{

    @Override
    public boolean isPrimeiro(MusicaMp3 musica1, MusicaMp3 musica2) {
        if(musica1.getEstrelas() > musica2.getEstrelas())
            return true;
        
        return false;
    }
    
}
