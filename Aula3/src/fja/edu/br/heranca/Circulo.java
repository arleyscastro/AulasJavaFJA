
package fja.edu.br.heranca;


public class Circulo extends Ponto{
    private double raio;

    public Circulo() {
        setRaio(0);
    }

    public Circulo(double raio, int x, int y) {
        super(x, y);
        setRaio(raio);
    }

    @Override
    public String toString() {
        return "Raio:" + raio + " => " + super.toString(); 
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio>0)
            this.raio = raio;
        else
            this.raio = 0;
    }
    
    
    
}
