package fja.edu.br;


public class Martelo extends Thread{
    private String produto;
    private int quantidade;
    private int tempo;

    public Martelo(String produto, int quantidade, int tempo) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        for(int i=1; i <= this.quantidade; i++){
            System.out.println("Prega " + this.produto + " : " + i);
            try {
                sleep( (long)(Math.random() * this.tempo)  );
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("O martelo terminou de pregar : " + this.produto);
    }
    
}
