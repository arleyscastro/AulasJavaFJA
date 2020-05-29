package aula10.fja.edu.br.adapter;


public class SdlSurface {
    public void sdlCarregarSurface(String arquivo){
        System.out.println("Surface carregado :" + arquivo);
    }
    
    public void sdlDesenhaSurface(int largura, int altura, int px, int py){
        System.out.println("SDL Surface :" + largura + ", " + 
                                             altura + ", " +
                                             px + ", " + 
                                             py);
    }
}
