package fjs.edu.br.cotratos;

import fjs.edu.br.entidades.ProdutoDto;
import java.util.ArrayList;


public interface IProdutoService {
    boolean Adicionar(ProdutoDto produto);
    boolean Alterar(ProdutoDto produto);
    boolean Deletar(ProdutoDto produto);
    ArrayList ListaTodos();
    ArrayList ListaTodosFiltrado(ProdutoDto produto);
    ProdutoDto ObtemProdutoPorId(int id);
}
