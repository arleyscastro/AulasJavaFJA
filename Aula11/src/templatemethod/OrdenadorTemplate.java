package templatemethod;

import java.util.ArrayList;


public abstract class OrdenadorTemplate {
    
    public abstract  boolean isPrimeiro(MusicaMp3 musica1, MusicaMp3 musica2);
    
    protected ArrayList<MusicaMp3> ordenaMusica(ArrayList<MusicaMp3> lista){
        ArrayList<MusicaMp3> novaLista = new ArrayList<MusicaMp3>();
        
        for (MusicaMp3 musicaMp3 : lista) {
            novaLista.add(musicaMp3);
        }
        //Ordenação.... não sabemos por que tipo iremos ordenar !!!
        for(int i=0; i< novaLista.size(); i++){
            for(int j=0; j< novaLista.size();j++){
                if(isPrimeiro(novaLista.get(i),novaLista.get(j))){
                    MusicaMp3 temp = novaLista.get(j);
                    novaLista.set(j, novaLista.get(i));
                    novaLista.set(i, temp);
                }
            }
        }
        
        return novaLista;
    }
}
