package fja.edu.br.dominio.entidades;


public class Vendas {
    private int idvendas;
    private Produto produto;
    private Vendedor vendedor;
    private double vlvenda;
    private int quantidade;

    public Vendas() {
        vendedor = new Vendedor();
        produto = new Produto();
    }

    public Vendas(int idvendas, Produto produto, Vendedor vendedor, double vlvenda, int quantidade) {
        this.idvendas = idvendas;
        this.produto = produto;
        this.vendedor = vendedor;
        this.vlvenda = vlvenda;
        this.quantidade = quantidade;
    }

    public int getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(int idvendas) {
        this.idvendas = idvendas;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getVlvenda() {
        return vlvenda;
    }

    public void setVlvenda(double vlvenda) {
        this.vlvenda = vlvenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
}
