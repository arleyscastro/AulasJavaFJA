package aula10.fja.edu.br.adapter;


public class SdlAdapter extends SdlSurface implements ImagemTarget{

    @Override
    public void carregarImagem(String nomeDoArquivo) {
        sdlCarregarSurface(nomeDoArquivo);
    }

    @Override
    public void desenharImagem(int x, int y, int largura, int altura) {
        sdlDesenhaSurface(largura, altura, x, y);
    }
    
}
