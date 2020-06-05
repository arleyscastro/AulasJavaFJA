package templatemethod;


public class MusicaMp3 {
    String nome;
    String autor;
    String album;
    int ano;
    int estrelas;

    public MusicaMp3(String nome, String autor, String album, int ano, int estrelas) {
        this.nome = nome;
        this.autor = autor;
        this.album = album;
        this.ano = ano;
        this.estrelas = estrelas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    
    
}
