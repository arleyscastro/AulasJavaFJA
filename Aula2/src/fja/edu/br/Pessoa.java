package fja.edu.br;


public class Pessoa {
    private String cpf;
    private String rg;
    private String nome;
    private int anonascimento;
    private float peso;
    private float altura;
    private String nacionalidade;

    public Pessoa() {
    }

    public Pessoa(String cpf, String rg, String nome, int anonascimento, float peso, float altura, String nacionalidade) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.anonascimento = anonascimento;
        this.peso = peso;
        this.altura = altura;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", rg=" + rg + ", nome=" + nome + ", anonascimento=" + anonascimento + ", peso=" + peso + ", altura=" + altura + ", nacionalidade=" + nacionalidade + '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnonascimento() {
        return anonascimento;
    }

    public void setAnonascimento(int anonascimento) {
        this.anonascimento = anonascimento;
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

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    
    
    
}
