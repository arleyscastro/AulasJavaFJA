package fja.edu.br.controladores;

import fja.edu.br.dominio.contratos.IProduto;
import fja.edu.br.dominio.entidades.Produto;
import fja.edu.br.infra.repositorio.ProdutoRepositorio;
import java.util.List;


public class ProdutoController {
    private Produto produto;
    private List<Produto> produtos = null;
    
    private IProduto prodRepositorio = new ProdutoRepositorio();


    public ProdutoController() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        if(produtos == null){
            produtos = prodRepositorio.getListaTodos();
        }
        return produtos;
    }
    
    public String preparaInclusao(){
        produto = new Produto();
        return "vaiParaIncluir";
    }
    
    public  String finalizaInclusao(){
        prodRepositorio.incluir(produto);
        produtos = null;
        return "voltaParaListagem";
    }
    
    public  String finalizaEdicao(){
        prodRepositorio.alterar(produto);
        produtos = null;
        return "voltaParaListagem";
    }
    
    public String finalizaDelecao(){
        prodRepositorio.deletar( produto.getIdproduto() );
        produtos = null;
        return "refresh";
    }
    
}
