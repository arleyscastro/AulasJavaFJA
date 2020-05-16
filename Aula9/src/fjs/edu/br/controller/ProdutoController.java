package fjs.edu.br.controller;

import fjs.edu.br.cotratos.IProdutoService;
import fjs.edu.br.entidades.ProdutoDto;
import fjs.edu.br.model.ProdutoModel;
import java.util.ArrayList;


public class ProdutoController {
    private IProdutoService prodServico;

    public ProdutoController() {
        this.prodServico = new ProdutoModel();
    }
    
    public boolean GravaProduto(ProdutoDto produto){
        return this.prodServico.Adicionar(produto);
    }
    
    public boolean AlteraProduto(ProdutoDto produto){
        return this.prodServico.Alterar(produto);
    }
    
    public boolean DeletarProiduto(ProdutoDto produtoDto){
        return this.prodServico.Deletar(produtoDto);
    }
    
    public ArrayList ConsultaTodosOsProdutos(){
        return this.prodServico.ListaTodos();
    }
    public ArrayList ConsultaTodosProdutoPorFiltro(ProdutoDto produto){
        return this.prodServico.ListaTodosFiltrado(produto);
    }
    
    public ProdutoDto ConsultaProdutoPorId(int id){
        return this.prodServico.ObtemProdutoPorId(id);
    }
    
    public float PrecoDoProduto(int id){
        ProdutoDto prod = this.prodServico.ObtemProdutoPorId(id);
        
        return prod.getPreco();
    }
    
}
