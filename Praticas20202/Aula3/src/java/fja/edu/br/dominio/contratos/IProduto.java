package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Produto;
import java.util.List;


public interface IProduto {
    boolean incluir(Produto produto);
    boolean alterar(Produto produto);
    boolean deletar(int id);
    Produto getConsultaPorId(int id);
    List<Produto> getListaTodos();
}
