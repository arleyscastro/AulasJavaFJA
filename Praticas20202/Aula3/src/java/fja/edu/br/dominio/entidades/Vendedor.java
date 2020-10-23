package fja.edu.br.dominio.entidades;


public class Vendedor {
    private int idvendedor;
    private String nome;
    private double comissao;

    public Vendedor() {
    }

    public Vendedor(int idvendedor, String nome, double comissao) {
        this.idvendedor = idvendedor;
        this.nome = nome;
        this.comissao = comissao;
    }

    public Vendedor(int idvendedor) {
        this.idvendedor = idvendedor;
    }

    public int getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(int idvendedor) {
        this.idvendedor = idvendedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
 
    
}
