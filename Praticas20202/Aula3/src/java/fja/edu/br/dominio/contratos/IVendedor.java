package fja.edu.br.dominio.contratos;

import fja.edu.br.dominio.entidades.Vendedor;
import java.util.List;


public interface IVendedor {
    boolean incluir(Vendedor vendedor);
    boolean alterar(Vendedor vendedor);
    boolean deletar(int id);
    Vendedor getRegistroPorId(int id);
    List<Vendedor> getListaTodos();
}
