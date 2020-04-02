package fja.edu.br.heranca;


public abstract class Ponto {
    private int x;
    private int y;

    public Ponto() {
        x=y=0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }


    
}
