package fja.edu.br.src;


public class Pessoa {
    private String nome;
    private float peso;
    private float altura;
    private float imc;

    public Pessoa(String nome, float peso, float altura, float imc) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
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
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
    
}
