package aula10.fja.edu.br.adapter;


public class OpenGLImagem {
    public void glCarregarImagem(String arquivo){
        System.out.println("Imagem Carregada :" + arquivo);
    }
    
    public void glDesenhaImagem(int px, int py){
        System.out.println("Open GL imagem carregada " + px + ", " + py);
    }
}
