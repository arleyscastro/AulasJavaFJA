package aula10.fja.edu.br.singleton;


public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private static Pessoa instancia = null;

    private Pessoa() {
    }
    
    public static Pessoa getInstancia(){
        if(instancia == null){
            instancia = new Pessoa();
        }
        return instancia;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
