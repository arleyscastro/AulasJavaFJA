package aula10.fja.edu.br.adapter;


public interface ImagemTarget {
    void carregarImagem(String nomeDoArquivo);
    void desenharImagem(int x, int y, int largura, int altura);
}
