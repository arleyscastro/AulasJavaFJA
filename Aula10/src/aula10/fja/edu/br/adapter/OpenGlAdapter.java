package aula10.fja.edu.br.adapter;


public class OpenGlAdapter extends OpenGLImagem implements ImagemTarget{

    @Override
    public void carregarImagem(String nomeDoArquivo) {
        glCarregarImagem(nomeDoArquivo);
    }

    @Override
    public void desenharImagem(int x, int y, int largura, int altura) {
        glDesenhaImagem(x-largura, y+altura);
    }
    
}
