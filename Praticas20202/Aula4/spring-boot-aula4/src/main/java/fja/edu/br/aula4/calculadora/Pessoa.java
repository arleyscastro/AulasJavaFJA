package fja.edu.br.aula4.calculadora;

public class Pessoa {
	
	private int id;
	private String nome;
	private String sexo;
	
	
	public Pessoa(int id, String nome, String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
	
}
