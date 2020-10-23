
package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Vendas;
import java.util.List;

public interface IVendas {
    boolean incluir(Vendas venda);
    boolean alterar(Vendas venda);
    boolean deletar(int id);
    Vendas getRegistroPorId(int id);
    List<Vendas> getListaTodos();
}
