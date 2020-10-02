package fja.edu.br.src;


public class CalculoImc {
    private String nome;
    private float peso;
    private float altura;
    private float imc;

    public CalculoImc() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        imc = peso / (altura * altura);
        return imc;
    }
    
    
    
}
