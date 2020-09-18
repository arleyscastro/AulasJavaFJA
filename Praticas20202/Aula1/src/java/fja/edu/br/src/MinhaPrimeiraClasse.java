package fja.edu.br.src;


public class MinhaPrimeiraClasse {
    private boolean ligadesliga = true;
    private String nome;
    private int numero1;
    private int numero2;
    private int resultado; 

    public MinhaPrimeiraClasse() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        this.resultado = this.numero1 + this.numero2;
        return resultado;
    }


    public boolean isLigadesliga() {
        return ligadesliga;
    }

    public void setLigadesliga(boolean ligadesliga) {
        this.ligadesliga = ligadesliga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }     
    
}
