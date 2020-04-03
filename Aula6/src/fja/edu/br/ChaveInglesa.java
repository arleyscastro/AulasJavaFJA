package fja.edu.br;


public class ChaveInglesa implements Runnable{
    private String produto;
    private int quantidade;
    private int tempo;

    public ChaveInglesa(String produto, int quantidade, int tempo) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        for(int i=1; i<= this.quantidade; i++){
            System.out.println("Aperta " + this.produto + " : " + i);
            try {
                Thread.sleep((long)(Math.random() * this.tempo));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Chave inglesa terminou de apertar " + this.produto);
    }
    
}
